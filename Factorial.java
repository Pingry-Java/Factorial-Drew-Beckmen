import java.util.Scanner;

/** This class carries out a factorial calculation of inputted number.
 * @author Drew Beckmen
 * @version 1.1
 */

public class Factorial
{
	/**
	 * Main method asks for user for number and calls another method to calculate factorial
	 * @param args standard array of strings
	 */
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("For what number do you want to calculate the factorial? ");
		int userNumber = keyboard.nextInt();
		keyboard.nextLine();
		int answer = factorial(userNumber);
		System.out.println(userNumber + "! is " + answer);
	
	}
	
	/**
	 * Factorial method calculates factorial of inputted number using a recursive algorithm
	 * @param number the number passed in by user to find factorial
	 * @return number the factorial of passed in number
	 */ 
	public static int factorial(int number)
	{
		if (number == 0)
			return 1;
		return number * factorial(number - 1);
	}

}