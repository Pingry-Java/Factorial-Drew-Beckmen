import java.util.Scanner;

/** This class carries out a factorial calculation of inputted number.
 */

public class Factorial
{
	
	public static void main(String[] args)
	{
		Scanner keyboard = new Scanner(System.in);
		System.out.print("For what number do you want to calculate the factorial? ");
		int userNumber = keyboard.nextInt();
		keyboard.nextLine();
		int answer = factorial(userNumber);
		System.out.println(userNumber + "! is " + answer);
	
	}
	
	public static int factorial(int number)
	{
		if (number == 0)
			return 1;
		return number * factorial(number - 1);
	}

}