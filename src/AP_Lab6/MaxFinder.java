package AP_Lab6;

public class MaxFinder {
	
	int nRows = 100;
	int nCols = 50;	
	
	Double[][] randArray = new Double[nRows][nCols];
	public void createArray() {
		for(int r=0;r<nRows;r++) {
			for(int c=0;c<nCols;c++) {
				randArray[r][c] = Math.random();
			}
		}
	}
	
	
	Double max = randArray[0][0];
	
	
	public Double findMax() {		
		
		for(int i = 0; i<this.nRows;i++) {
			for(int j = 0; j<this.nCols;j++) {				
				
				if(randArray[i][j]>max) {
					max=randArray[i][j];
				}
			}
		}
		return max;
	}

}
