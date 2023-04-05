package AP.AP_Lab6;

public class MaxFinder {
	
	int nRows = 100;
	int nCols = 50;	
	
	
	public Double[][] createArray() {
		Double[][] randArray = new Double[nRows][nCols];
		for(int r=0;r<nRows;r++) {
			for(int c=0;c<nCols;c++) {
				randArray[r][c] = Math.random();
			}
		}
		return randArray;
	}
	
	
	
	public int getnRows() {
		return nRows;
	}

	public void setnRows(int nRows) {
		this.nRows = nRows;
	}

	public int getnCols() {
		return nCols;
	}

	public void setnCols(int nCols) {
		this.nCols = nCols;
	}



//	public Double findMax(Double[][] array) {		
//		Double max = array[0][0];
//		for(int i = 0; i<this.nRows;i++) {
//			for(int j = 0; j<this.nCols;j++) {				
//				
//				if(array[i][j]>max) {
//					max=array[i][j];
//				}
//			}
//		}
//		return max;
//	}

}
