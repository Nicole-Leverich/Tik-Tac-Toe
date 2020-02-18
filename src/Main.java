import java.util.Random;
import java.util.Scanner;

public class Main {

	public static int number, guess, maxValue;
	public static Scanner scan;
	public static Random rand;

	public static void main(String args[]) {
		scan = new Scanner(System.in);
		rand = new Random();
		System.out.println("Please enter a max rang: ");
		maxValue= scan.nextInt();
		number = rand.nextInt(maxValue);
		System.out.print("Please enter a guess:");
		while (guess != number) {
			guess = scan.nextInt();

			if (guess > number) {
				System.out.println("Your guess is to high!");
			}
			if (guess < number) {
				System.out.println("Your guess is to low!");
			}
			
		}
		
		System.out.println ("You won!");
	}
}

