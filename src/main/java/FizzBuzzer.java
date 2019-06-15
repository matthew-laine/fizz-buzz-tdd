
public class FizzBuzzer {

	public String fizzBuzz(int fizzBuzzNumber) {
		// TODO Auto-generated method stub
		if(fizzBuzzNumber < 1) {
			return "Invalid Input";
		} else if(fizzBuzzNumber % 3 == 0 && fizzBuzzNumber % 5 == 0 ) {
			return "FizzBuzz";
		} else if(fizzBuzzNumber % 5 == 0) {
			return "Buzz";
		} else if(fizzBuzzNumber % 3 == 0) {
			return "Fizz";
		} else {
			return Integer.toString(fizzBuzzNumber);
		}
	}
}
