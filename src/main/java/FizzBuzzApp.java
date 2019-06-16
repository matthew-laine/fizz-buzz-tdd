import java.util.Scanner;

public class FizzBuzzApp {

	public static void main(String[] args) {
		Scanner consoleInput = new Scanner(System.in);
		FizzBuzzer fizzBuzzer = new FizzBuzzer();
		int fizzBuzzNumber;
		boolean gameIsOn = true;
		
		do {
			System.out.println("Please input a positive integer.");
			System.out.println("Input -1 to quit.");
			
			fizzBuzzNumber = consoleInput.nextInt();
			if(fizzBuzzNumber == -1) {
				gameIsOn = false;
				System.out.println("Thanks for playing :)");
			} else if(fizzBuzzNumber < 1) {
				continue;
			} else {
				System.out.print("Your FizzBuzz Result Is: ");
				System.out.println(fizzBuzzer.fizzBuzz(fizzBuzzNumber));
				System.out.println();
			}
		} while(gameIsOn);
		
		consoleInput.close();
	}
}
