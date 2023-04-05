package Prog.Lab;
import java.util.Scanner;

public class Lab3Ex1Q6 {

	public static void main(String[] args) {
		
/*		This exercise explores your understanding of the Scanner. Write a program that asks
		a user to enter their first name and their age (with a space in between, e.g. they type
		“Simon 123”) followed by return. Use s.nextLine() to get this information as a String.
		Pass this String to a second scanner object (make a new one with Scanner t = new
		Scanner(theString);) and, use this to separate the two fields (t.next() will give the
		name and t.nextInt() will get the age). What happens if the user enters their first and
		second names separated by a space as well as the age (e.g. “Simon Rogers 123”)?
		Add an extra line that fixes this problem.
*/
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Please enter first name and your age");
		String userEntry = keyboard.nextLine();
		
		 Scanner t = new Scanner(userEntry);
		 String name = t.next();
		 String name2 = t.next();
		 int age = t.nextInt();
		 System.out.print("first name: " + name );
		 if (name2!=null) {
			 System.out.print(", second name: " + name2 );
		 }
		 System.out.print(" and your age is " + age + ".");
	}

}
