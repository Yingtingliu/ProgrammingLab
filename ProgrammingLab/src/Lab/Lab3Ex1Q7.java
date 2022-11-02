package Lab;
import java.util.Scanner;

public class Lab3Ex1Q7 {

	public static void main(String[] args) {
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("when is your birthday?");
		String userEntry = keyboard.nextLine();
		
		 Scanner t = new Scanner(userEntry);
		 String date = t.next();
		 String month = t.next();
		 int year = t.nextInt();
		 System.out.print("day of birth: " + date );
		 
		 System.out.print(", month of birth: " + month );
		 
		 System.out.print(" and year of birth " + year + ".");

	}

}
