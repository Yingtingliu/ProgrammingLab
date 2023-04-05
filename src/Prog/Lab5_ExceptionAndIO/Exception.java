package Prog.Lab5_ExceptionAndIO;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exception {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		boolean flag;
		int number;
		do {
			Scanner sc1 = new Scanner(System.in);
			String temp = sc1.nextLine();
			Scanner sc2 = new Scanner(temp);
			try {
				flag = true;
				number = sc2.nextInt();				
				
			} catch(InputMismatchException e) {
				e.printStackTrace();
				System.out.println("There's no integer!");
				flag = false;
			} 
		}while(flag == false);
	}

}
