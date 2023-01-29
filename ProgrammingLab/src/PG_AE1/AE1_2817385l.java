/* 
Instructions - Assessed Exercise 1
- This exercise tests the things you've learnt in the first week of the semester.
- Add your code to this file, leaving the main method unchanged except to call your methods.
- Add all of your methods *below* the main method, in question order.
- Each of the tasks involves writing a single method. You do not need to add additional main methods.
- The total number of marks is 22.
- Read the instructions for each task *carefully*.
- Submit a single .java file on moodle by the deadline (details on moodle).
- Your java file must be called AE1_<yourguid>.java
- You do not need to add any additional import lines.
- Everything you need to do these tasks is covered in the week 1 lectures and slides.
- You do not need to perform error checking unless explicitly requested in the task.
*/

/*
Non task-specific marks:
 - Add a comment with your name and GUID here - [1 mark]
 Name: Ying Ting Liu, GUID: 2817385L
 - Clear code commenting [1 mark]
 - Use of correct Java variable and method naming conventions [1 mark]
*/
package PG_AE1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class AE1_2817385l {

	public static void main(String[] args) {

		/*
		 * EXAMPLE TASK:
		 * 
		 * This code here demonstrates how you should answer the questions. You will be
		 * asked to create code to perform certain tasks. It is important that you leave
		 * this main method unmodified, except for where you need to call the methods
		 * that you create.
		 * 
		 * So, if I asked you to create a method called helloWorld that will print the
		 * following line: 'hello world!' you should do the following: create the method
		 * body below the main method as shown, and call it from main as below.
		 */

		helloWorld();

		/*
		 * Now, please make a start on the following tasks below: Reminder, you are
		 * supposed to work on this assessment on your own, to test your own
		 * understanding and to strengthen your problem solving skills.
		 */

		/*
		 * TASK 1: (2 marks)
		 * 
		 * Create a method called 'task1' to calculate the area of a rectangle and call
		 * it from main here. The method will not specify any input parameters. Within
		 * the method, use a scanner to capture user input. The user should be prompted
		 * for both the length and width of the rectangle.
		 * 
		 * Note that the length and width of the rectangle can be specified to 2 decimal
		 * places. Once entered, calculate the area and print it to the screen.
		 * 
		 */

		/*
		 * TASK 2: (3 marks)
		 * 
		 * Create a method called 'task2' that will take two integer input parameters,
		 * max and number. The method should print out the total number of values (not
		 * the values themselves) between 1 and max (inclusive) that satisfy the
		 * following conditions:
		 * 
		 * The value must be odd, and the value must be a factor of number.
		 * 
		 * Your main method must pass in max = 99. For example, if I passed in the
		 * parameters task2(99, 39) the output should be 4.
		 */

		/*
		 * TASK 3: (3 marks)
		 * 
		 * Create a method called 'task3' that will take an int parameter and assign it
		 * to the variable 'challenge'. This method will play out a table top game at
		 * the console. The idea is that players roll a 20-sided dice and indicate what
		 * they got in the terminal.
		 * 
		 * You are not being asked to program the dice roll, you can assume the user
		 * will simply input a number between 1 and 20.
		 * 
		 * The game plays out over a series of rounds. On each round, the player should
		 * be prompted for input specifying what they rolled. If the player rolls higher
		 * than the challenge, then they are successful in attacking the monster, and
		 * the monster will lose 1 hit point. If the player rolls less than or the value
		 * of challenge, they are not successful.
		 * 
		 * If the player is not successful, the monster will attack. When the player
		 * fails for the first time the monster will miss and the player will not lose a
		 * hit point. However, on the second failed attempt onwards, the monster will
		 * always be successful and the player will lose a hit point.
		 * 
		 * The game continues until either the player or the monster lose all their hit
		 * points. Both the player and the monster should start with 3 hit points.
		 * 
		 * You must use a while loop in this code. The input parameter (challenge)
		 * should be set to 10.
		 */

		/*
		 * TASK 4: (6 marks)
		 * 
		 * Create a method 'task4' that will take an integer as an input parameter. This
		 * value will be used in a guessing game where the user is to input a series of
		 * guesses, to try and guess the number held by the method, which is the input
		 * parameter.
		 * 
		 * Each time the player guesses, they are to be prompted for input. An example
		 * of expected input can be seen below:
		 * 
		 * 16 97
		 * 
		 * Each time the player guesses, they are to input 2 numbers, separated by a
		 * single space. Your method should take both of these guesses, and determine
		 * which value is closer to the secret number. Your method should ensure that
		 * exactly 2 guesses are entered. If not, it should print an error message.
		 * 
		 * If either of the guesses are correct, then the player wins. Otherwise they
		 * are presented with some console output, telling them how far away they are,
		 * which is to be calculated based on which guess was the closest of the two.
		 * 
		 * The output the user should see must be formatted, with '0' being used as
		 * padding. The readout should be 3 characters long. Therefore, if the secret
		 * number is 364, and the user enters 4 300 as their guess, the readout must be
		 * exactly:
		 * 
		 * You are 064 away from the secret number!
		 */

		/*
		 * TASK 5: (5 marks)
		 * 
		 * Create a method 'task5' that will take 2 int parameters rows and columns.
		 * This method will create a table on the console output, representing the game
		 * of mine sweeper. The aim of this task is to illustrate to the player where
		 * all the mines are on the board, such as what occurs in the standard 'game
		 * over' screen for mine sweeper.
		 * 
		 * The method should accept values between 5 and 10 for the rows and columns,
		 * however it is not required that the value of rows should match the value of
		 * columns.
		 * 
		 * The minimum value that must be entered for the rows and columns is 5, and the
		 * maximum is 10. Your method should check this. If ok, then the method will
		 * continue, otherwise it should print out an error message.
		 * 
		 * The method should print a header for the table, labelling the columns,
		 * beneath, a separator as shown in the example. The method should then populate
		 * the table, using the character 'o' to represent clear cells and the character
		 * 'x' to represent mines. Each row should also be labelled as 1, 2, 3, etc.
		 * 
		 * The mines are to be specified with 2 int values, x,y such that x represents
		 * the row position, and y represents the column position. Your method must
		 * specify three mines.
		 * 
		 * You are expected to use String.format() in this task, to format the table.
		 * The cells should be padded to a length of 3 with no unnecessary information
		 * to pad the cells. (i.e. no occurrences of for example, XoX or OoO)
		 * 
		 * If for example, the table was specified with having 10 rows and 6 columns,
		 * and the 3 mines were specified at 3,4 and 1,5 and 6,6 your table must look
		 * *exactly* like this:
		 * 
		 * 
		 * | 1 2 3 4 5 6 | - - - - - - 1 | o o o o x o
		 * 
		 * 2 | o o o o o o
		 * 
		 * 3 | o o o x o o
		 * 
		 * 4 | o o o o o o
		 * 
		 * 5 | o o o o o o
		 * 
		 * 6 | o o o o o x
		 * 
		 * 7 | o o o o o o
		 * 
		 * 8 | o o o o o o
		 * 
		 * 9 | o o o o o o
		 * 
		 * 10 | o o o o o o
		 */

		/*
		 * PLACE YOUR METHOD CALLS HERE
		 */
		task1();
		task2(99, 39);
		task3(10);
		task4(100);
		task5(10, 6);

	}

	/*
	 * EXAMPLE METHOD
	 */
	private static void helloWorld() {
		System.out.println("hello world!");
	}

	/*
	 * PLACE YOUR METHODS HERE
	 */

	public static void task1() {
		Scanner obj = new Scanner(System.in); // Create a Scanner object
		final DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Enter length");

		Double length = obj.nextDouble(); // Read user input

		System.out.println("Enter width");

		Double width = obj.nextDouble(); // Read user input
		System.out.println("Rectangel area is: " + df.format(length * width)); // Output user input
		System.out.println("---------------------------------------");
	}

	public static void task2(int max, int param) {
		int flag = 0;

		for (int i = 1; i <= param; i++) {
			if (i % 2 != 0 && param % i == 0 && i < max) {
				flag = flag + 1;
			}
		}
		System.out.println("The value is:" + flag);
		System.out.println("---------------------------------------");
	}

	public static void task3(int challenge) {
		Scanner sc = new Scanner(System.in); // dice between 1-20
		int monster = 3;
		int player = 3;
		int flag = 0;

		while (monster > 0 && player > 0) {
			System.out.println("Please input the number of the dice (from 1-20)");
			int dice = sc.nextInt();
			if (dice > challenge) {
				monster -= 1;
			} else {
				if (flag == 0) { // player lose for the first time
					flag += 1;
				} else { // player lose after the first time, deduct the point
					player -= 1;
				}
			}
			System.out.println("player's hit point is " + player + "; monster's hit point is " + monster);
			System.out.println("-----------------");
		}
		if (player == 0) { // show the gaming result
			System.out.println("player loses the game");
		} else {
			System.out.println("monster loses the game");
		}

	}

	public static void task4(Integer param) { // number for guessing

		Scanner sc = new Scanner(System.in);
		boolean isWrong = true;
		String secondWord;
		String firstWord;
		String temp;

		while (isWrong == true) { // if it's incorrect continue the loop
			System.out.println("Please enter two number. eg.10 131");
			temp = sc.nextLine(); // get the whole line

			Scanner in = new Scanner(System.in);
			in = new Scanner(temp); // make it a scanner
			firstWord = in.next(); // get the first word

			// check if it has second number
			if (!in.hasNext()) {
				System.out.println("Wrong attempt! Please enter two number at a time.");
			} else {

				secondWord = in.next();
				Integer firstNumber = Integer.valueOf(firstWord);
				Integer secondNumber = Integer.valueOf(secondWord);

				// check if any of them are secret number
				if (param == firstNumber || param == secondNumber) { // get the secret number
					isWrong = false; // to end the loop

				} else { // fail to get the secret number

					// calculate the distance to secret number
					Integer value1 = Math.abs(param - firstNumber);
					Integer value2 = Math.abs(param - secondNumber);

					// print out the smaller distance number
					if (value1 < value2) {
						String formatted1 = String.format("%03d", value1);
						System.out.println("You are " + formatted1 + "away from the secret number!");
					} else {
						String formatted1 = String.format("%03d", value2);
						System.out.println("You are " + formatted1 + " away from the secret number!");
					}

				} // end of second if else

			} // end of first if else

		} // end of while loop

		// print out the correct answer!
		System.out.println("The secret number is " + param);
		System.out.println("---------------------------------------");
	}

	public static void task5(int rows, int columns) {
		if (rows >= 5 && rows <= 10 && columns >= 5 && columns <= 10) { // check the input value
			String[][] table = new String[rows][columns];
			int i;
			// set everything into "o"
			for (i = 0; i < rows; i++) {
				for (int j = 0; j < columns; j++) {
					table[i][j] = "o";
				}
			}
			// set mines into "x"
			table[0][4] = "x"; // starts from zero, which means this is {1,5}
			table[2][3] = "x"; // starts from zero, which means this is {3,4}
			if (rows < 5 && columns < 5) {
				table[5][5] = "x"; // starts from zero, which means this is {6,6}
			}

			// print out the header of the table
			// row1
			System.out.print("   | ");
			for (int j = 0; j < columns; j++) {
				System.out.printf(" %s ", j + 1);
			}
			System.out.println();
			// row2
			System.out.print("   | ");
			for (int j = 0; j < columns; j++) {
				System.out.print(" - ");
			}
			System.out.println();

			// print out the table
			for (i = 0; i < rows; i++) {
				System.out.printf("%2d | ", i + 1);
				for (int j = 0; j < columns; j++) {
					System.out.printf(" %s ", table[i][j]);
				}
				System.out.println();
			}

		} else { // print out an error message because the input value are not in the range.
			System.out.println("Both rows and columns only accept values between 5 and 10.");
		}
	}

}
