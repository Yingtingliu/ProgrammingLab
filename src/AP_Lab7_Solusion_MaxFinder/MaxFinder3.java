package AP_Lab7_Solusion_MaxFinder;
public class MaxFinder3 {
    public static class MaxRow implements Runnable {
        Double[] row;
        SharedDouble2 d;
        public MaxRow(Double[] row,SharedDouble2 d) {
            this.row = row;
            this.d = d;
        }
        public void run() {
            for(int i=0;i<row.length;i++) {
                d.compare(row[i]);
            }
        }
    }
    public static void main(String[] args) {
        int nRows = 100;
        int nCols = 50;
        Double[][] randArray = new Double[nRows][nCols];
        for(int r=0;r<nRows;r++) {
            for(int c=0;c<nCols;c++) {
                randArray[r][c] = Math.random();
            }
        }

        // Find the max using loops
        Double max = 0.0;
        for(int r=0;r<nRows;r++) {
            for(int c=0;c<nCols;c++) {
                if(randArray[r][c] > max) {
                    max = randArray[r][c];
                }
            }
        }
        System.out.println(max);

        // Threaded solution
        SharedDouble2 d = new SharedDouble2();
        d.setD(0.0);
        Thread[] threads = new Thread[nRows];
        for(int i =0;i<nRows;i++) {
            threads[i] = new Thread(new MaxRow(randArray[i],d));
            threads[i].start();
        }
        try {
            for(int i=0;i<nRows;i++) {
                threads[i].join();
            }
        }catch(InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(d.getD());
    }
}