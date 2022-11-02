package Lab;

public class LoopEx3 {

	public static void main(String[] args) {
		// Please change number for checking
		int number = 5;
		int flag = 0;
		
		
		if(number!=2 && number%2==0) {
			flag =1;			
		}else if(number==1 || number ==2) {
			flag =0;
		}else {
			
			//for loop		
//			for(int count=2; number>count ;count++) {
//				if(number%count==0) {
//					flag=1;		
//					break;			
//				};
//				
//			}
			
			//while loop
			int count=2;
			while(number%count!=0) {
				count++;
				flag=1;
				break;
			}
			
			
			
		}
		if(flag==1) {
			System.out.println(number+" is not prime!");
		}else {
			System.out.println(number+" is prime!");
		}
	}

}
