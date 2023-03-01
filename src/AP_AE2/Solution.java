package AP_AE2;

import java.util.ArrayList;
import java.util.List;

public class Solution implements CommandRunner {

    private final List<SlowCalculator> tasks;
    private final List<Thread> threads;

    public Solution() {
        tasks = new ArrayList<>();
        threads = new ArrayList<>();
    }

    @Override
    public String runCommand(String command) {
    	String string = "";
        String[] parts = command.split(" ");
        String part = parts[1];
        long startNum = Long.parseLong(parts[1]);
        switch (parts[0]) {
        	
            case "start":            	
            	
            	if(part != null) {            		
            		return  start(startNum);         		
            	} 
                return "Invalid command";
                
            case "cancel":
            	
                long m = Long.parseLong(parts[1]);
                
                for (int i = 0; i < tasks.size(); i++) {
                    SlowCalculator t = tasks.get(i);
                    if (t.getN() == m) {
                        Thread th = threads.get(i);
                        if (th.isAlive()) {
                            th.interrupt();
                            return "Cancelled " + m;
                        } else {
                            return "Invalid command";
                        }
                    }
                }
                return "Invalid command";
                
            case "running":
            	
                int count = 0;
                StringBuilder sb = new StringBuilder();
                
                for (int i = 0; i < tasks.size(); i++) {
                    SlowCalculator t = tasks.get(i);
                    Thread th = threads.get(i);
                    if (th.isAlive()) {
                        sb.append(t.getN()).append(" ");
                        count++;
                    }
                }
                
                return count + " calculations running: " + sb.toString().trim();
                
            case "get":
            	
                long p = Long.parseLong(parts[1]);
                
                for (SlowCalculator t : tasks) {
                    if (t.getN() == p) {
                        if (Thread.currentThread().isInterrupted()) {
                            return "Interrupted";
                        } else {
                            while (true) {
                                try {
                                    Thread.sleep(100);
                                } catch (InterruptedException e) {
                                    Thread.currentThread().interrupt();
                                    return "Interrupted";
                                }
                                if (Thread.currentThread().isInterrupted()) {
                                    return "Interrupted";
                                } 
//                                else if (t.getResult() != null) {
//                                    return "result is " + t.getResult();
//                                }
                            }
                        }
                    }
                }
                return "Invalid command";
                
            case "finish":
            	
                for (Thread th : threads) {
                    try {
                        th.join();
                    } catch (InterruptedException e) {
                        Thread.currentThread().interrupt();
                        return "Interrupted";
                    }
                }
                return "Finished";
                
            case "abort":
            	
                for (Thread th : threads) {
                    th.interrupt();
                }
                return "Aborted";
                
            default:
                return "Invalid command";
        }
    }
    
    public String start(Long num) {
    	
    	
        SlowCalculator task = new SlowCalculator(num);
        tasks.add(task);
        
        Thread thread = new Thread(() -> {
            try {
                task.run();
            } catch (Exception e) {
                // ignore
            }
        });
        threads.add(thread);
        thread.start();
        
        return "Started " + Long.toString(num);
    }

}
