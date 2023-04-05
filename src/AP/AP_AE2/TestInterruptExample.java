package AP.AP_AE2;

public class TestInterruptExample {

    public static void main(String[] args) {
        Thread t1 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 1 is running...");
                try {
                    Thread.sleep(1000); // add a sleep statement
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted: " + Thread.currentThread().isInterrupted());
                    return; // exit the loop
                }
            }
        }, "Thread 1");

        Thread t2 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 2 is running...");
                try {
                    Thread.sleep(1000); // add a sleep statement
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted: " + Thread.currentThread().isInterrupted());
                    return; // exit the loop
                }
            }
        }, "Thread 2");

        Thread t3 = new Thread(() -> {
            while (!Thread.currentThread().isInterrupted()) {
                System.out.println("Thread 3 is running...");
                try {
                    Thread.sleep(1000); // add a sleep statement
                } catch (InterruptedException e) {
                    System.out.println(Thread.currentThread().getName() + " was interrupted: " + Thread.currentThread().isInterrupted());
                    return; // exit the loop
                }
            }
        }, "Thread 3");

        t1.start(); // start the first thread
        t2.start(); // start the second thread
        t3.start(); // start the third thread

        // wait for a few seconds
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        t1.interrupt(); // interrupt the first thread
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        t2.interrupt(); // interrupt the second thread
        t3.interrupt(); // interrupt the third thread

        // print the interrupt status of the threads
        System.out.println("thread 1" + t1.isInterrupted());
        System.out.println("thread 2" + t2.isInterrupted());
        System.out.println("thread 3" + t3.isInterrupted());

        // clear the interrupt flag of the current thread
        System.out.println(Thread.currentThread().getName());
        Thread.interrupted();
//        Thread.interrupted();
//        Thread.interrupted();

        // print the interrupt status of the threads again
        System.out.println("thread 1" +t1.isInterrupted());
        System.out.println("thread 2" +t2.isInterrupted());
        System.out.println("thread 3" +t3.isInterrupted());
    }
}
