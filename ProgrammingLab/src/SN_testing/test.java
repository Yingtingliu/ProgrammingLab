package SN_testing;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int possum=0;
		int negcount=0;
		int oddCount=0;
		boolean overflow = false; //turn out to be one when overflow

		int n =12;
		int[] x = {3, -6, 27, 101, 50, 0, -20, -21, 19, 6, 4, -10};


		for(int i=0; i<x.length; i++){
			//positive and negative traversal
			if(x[i]>=0){
				possum += x[i];
				if( possum >32767 ){
					overflow = true;
				}
				if(x[i]%2 != 0 && x[i]!=0){
					oddCount++;
				}
			} else{
				negcount++;
			}
			
			//odd number
			
			System.out.println("possum: "+possum+", overflow: " + overflow + ", negcount: " + negcount + ", oddCount: " + oddCount);

		}

	}

}
