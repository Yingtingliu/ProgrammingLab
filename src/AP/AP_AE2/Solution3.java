package AP.AP_AE2;

import java.util.ArrayList;
import java.util.List;

public class Solution3 implements CommandRunner {

    private final List<SlowCalculator> tasks;
    private final List<Thread> threads;

    public Solution3() {
        tasks = new ArrayList<>();
        threads = new ArrayList<>();
    }

    @Override
    public synchronized String runCommand(String command) {
        String[] words = command.split("\\s+");

        if (words.length == 2) {
            try {
                long input = Long.parseLong(words[1]);
                if (words[0].equals("start")) {
                    SlowCalculator calculator = new SlowCalculator(input);
                    Thread thread = new Thread(() -> calculator.run());
                    tasks.add(calculator);
                    threads.add(thread);
                    thread.start();
                    return "Started " + input;
                } else if (words[0].equals("cancel")) {
                    for (int i = 0; i < tasks.size(); i++) {
                        SlowCalculator calculator = tasks.get(i);
                        Thread thread = threads.get(i);
//                        if (calculator.getInput() == input && !calculator.isFinished()) {
//                            calculator.cancel();
//                            return "Cancelled " + input;
//                        }
                    }
                } else if (words[0].equals("get")) {
                    for (SlowCalculator calculator : tasks) {
//                        if (calculator.getInput() == input) {
//                            if (calculator.isFinished()) {
//                                return "result is " + calculator.getResult();
//                            } else {
//                                return "calculating";
//                            }
//                        }
                    }
                }
            } catch (NumberFormatException e) {
                // invalid input, fall through to default case
            }
        }

        if (words.length == 1) {
            if (words[0].equals("running")) {
                List<Long> inputs = new ArrayList<>();
                for (SlowCalculator calculator : tasks) {
//                    if (!calculator.isFinished()) {
//                        inputs.add(calculator.getInput());
//                    }
                }
//                return inputs.size() + " calculations running: " + String.join(" ", inputs);
            } else if (words[0].equals("finish")) {
                for (Thread thread : threads) {
                    try {
                        thread.join();
                    } catch (InterruptedException e) {
                        // ignore
                    }
                }
                return "Finished";
            } else if (words[0].equals("abort")) {
                for (SlowCalculator calculator : tasks) {
//                    calculator.cancel();
                }
                for (Thread thread : threads) {
                    thread.interrupt();
                }
                return "Aborted";
            }
        }

        return "Invalid command";
    }

}
