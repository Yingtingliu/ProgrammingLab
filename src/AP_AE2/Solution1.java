package AP_AE2;

import java.util.ArrayList;
import java.util.List;

public class Solution1 implements CommandRunner {

	private final List<SlowCalculator> tasks;
	private final List<Thread> threads;

	public Solution1() {
		tasks = new ArrayList<>();
		threads = new ArrayList<>();
	}

	@Override
	public String runCommand(String command) {
		String[] words = command.split("\\s+");
		String string = "Invalid command";
		if(words.length==2) {  
			long inputNum = Long.parseLong(words[1]);
    		return  start(inputNum);         		
    	} 
        
		return string;
	}

	private String start(Long num) {

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
