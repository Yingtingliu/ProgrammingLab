package AP.AP_AE2;

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
		String[] words = command.split("\\s+");
		
		switch (words[0]) {

			case "start":
				
				if (words.length != 2) {
					return "Invalid command";
				} else {
					long inputNum = Long.parseLong(words[1]);
					return start(inputNum);
				}

			case "cancel":

				if (words.length != 2) {
					return "Invalid command";
				} else {
					long inputNum = Long.parseLong(words[1]);
					return cancel(inputNum);
				}

			case "running":
				
				if (words.length != 1) {
					return "Invalid command";
				} else {
					return running();
				}			

			case "get":

				if (words.length != 2) {
					return "Invalid command";
				} else {
					long inputNum = Long.parseLong(words[1]);
					return get(inputNum);
				}

			case "finish":
				
				if (words.length != 1) {
					return "Invalid command";
				} else {
					return finish();
				}
				
			case "abort":
				if (words.length != 1) {
					return "Invalid command";
				} else {
					return abort();
				}
				
			default:
				return "Invalid command";
		}
	}

	private String start(Long num) {

		SlowCalculator task = new SlowCalculator(num);

		tasks.add(task);

		Thread thread = new Thread(task);
		threads.add(thread);

		thread.start();

		return "Started " + Long.toString(num);
	}

	private String cancel(Long num) {

		for (int i = 0; i < tasks.size(); i++) {
			SlowCalculator t = tasks.get(i);
			if (t.getN() == num) {
				Thread th = threads.get(i);
				if (th.isAlive()) {
					th.interrupt();
					tasks.remove(i);
					threads.remove(i);
					return "Cancelled " + num;
				} else if(t.isComplete()) {
					return "";
				} else {
					return "Invalid command";
				}
			}
		}

		return "Invalid command";

	}
	

	private String running() {
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
	}

	private String get(Long num) {

		for (SlowCalculator t : tasks) {
			if (t.getN() == num) {
				if (t.isComplete()) {
					return "result is " + t.getResult();
				} else {
					return "calculating";
				}
			}
		}
		return "Invalid command";
	}

	/*
	 * Reference: Thread.currentThread().interrupt();
	 * https://stackoverflow.com/questions/4906799/
	 * why-invoke-thread-currentthread-interrupt-in-a-catch-interruptexception-block
	 */
	private String finish() {

		for (Thread thread : threads) {
			try {
				thread.join();
			} catch (InterruptedException e) {
				// ensure it come back even with interrupt
				Thread.currentThread().interrupt();
				e.printStackTrace();
			}

		}
		return "Finished";
	}

	private String abort() {

		for (Thread th : threads) {
	        th.interrupt();
	    }
	    tasks.clear();
	    threads.clear();
	    
	    if (tasks.isEmpty() && threads.isEmpty()) {
	        return "Aborted";
	    } else {
	        return "Aborted fail";
	    }
	}

}
