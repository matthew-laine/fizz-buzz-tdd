
public class FizzBuzzer {

	public String fizzBuzz(int fizzBuzzNumber) {
		
		String result = "";
		
		if(isInvalidInput(fizzBuzzNumber)) {
			return "Invalid Input";
		}
		if (isDivisibleByThree(fizzBuzzNumber)) {
			result += "Fizz";
		}
		if (isDivisibleByFive(fizzBuzzNumber)) {
			result += "Buzz";
		}
		if (result.isEmpty()) {
			result += fizzBuzzNumber;
		}
		return result ;
	}	

	private boolean isDivisibleByFive(int fizzBuzzNumber) {
		return fizzBuzzNumber % 5 == 0;
	}

	private boolean isDivisibleByThree(int fizzBuzzNumber) {
		return fizzBuzzNumber % 3 == 0;
	}

	private boolean isInvalidInput(int fizzBuzzNumber) {
		return fizzBuzzNumber < 1;
	}
}
