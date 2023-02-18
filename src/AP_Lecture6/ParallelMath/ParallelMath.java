package AP_Lecture6.ParallelMath;

public class ParallelMath {
    static class RunOnSubarray implements Runnable {
        double[] inputArray, outputArray;
        int firstIndex, count;

        public RunOnSubarray(double[] inputArray, double[] outputArray, int firstIndex, int count) {
            this.inputArray = inputArray;
            this.outputArray = outputArray;
            this.firstIndex = firstIndex;
            this.count = count;
        }

        public void run() {
            for (int index = firstIndex; index < firstIndex + count; ++index) {
                final double input = inputArray[index];
                outputArray[index] = calculateExpSlowly(input);
            }
        }

        static double calculateExpSlowly(final double x) {
            // This calculates exp(x) using a Taylor series. The maths is not important. What matters is that
            // it's a slooow calculation. In real life you would use Math.exp(x)
            double result = 1.;
            double factorial = 1.;
            for (int n = 1; n < 1000; ++n) {
                factorial *= n;
                result += Math.pow(x, n) / factorial;
            }
            return result;
        }
    }

    public static void main(String[] args) throws InterruptedException {
        final int numInputs = 1000000;
        double[] inputs = new double[numInputs];
        double[] outputs = new double[numInputs];
        for (int index = 0; index < numInputs; ++index) {
            inputs[index] = Math.random();
        }
        final int numThreads = 4;
        final int countPerThread = numInputs / numThreads;
        assert numInputs % numThreads == 0;  // the number of threads must exactly divide the number of inputs
        final Thread[] threads = new Thread[numThreads];
        for (int threadIndex = 0; threadIndex < numThreads; ++threadIndex) {
            final int firstIndex = threadIndex * countPerThread;
            threads[threadIndex] = new Thread(new RunOnSubarray(inputs, outputs, firstIndex, countPerThread));
            threads[threadIndex].start();
        }
        for (int threadIndex = 0; threadIndex < numThreads; ++threadIndex) {
            threads[threadIndex].join();
        }
    }
}
