package Lab;
import java.util.Scanner;

public class LoopEx1 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter what integer for times table");
		int number = keyboard.nextInt();
		System.out.println("how many times do you want to times?");
		int times = keyboard.nextInt();
//		int i= 1;
		timesTable(number,times);

	}
	public static void timesTable(int i,int j) {
		for (int k=1;k<j;k++) {
			System.out.println(k +"X" +j + "=" + k*j);
		}
	}

}
