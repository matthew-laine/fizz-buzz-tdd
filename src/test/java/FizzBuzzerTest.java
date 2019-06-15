import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FizzBuzzerTest {
	@Test
	public void whenInputLessThanOneReturnInvalidInput() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(0);
		assertEquals("Invalid Input", testOutput);
	}
	
	@Test
	public void whenInputIsOneThenReturnOne() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(1);
		assertEquals("1", testOutput);
	}
	
	@Test
	public void whenInputIsTwoThenReturnTwo() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(2);
		assertEquals("2", testOutput);
	}
	
	@Test
	public void whenInputIsThreeThenReturnFizz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(3);
		assertEquals("Fizz", testOutput);
	}
	
	@Test
	public void whenInputIsSixThenReturnFizz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(6);
		assertEquals("Fizz", testOutput);
	}
	
	@Test
	public void whenInputIsFiveThenReturnBuzz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(5);
		assertEquals("Buzz", testOutput);
	}
	
	@Test
	public void whenInputIsTenThenReturnBuzz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(10);
		assertEquals("Buzz", testOutput);
	}
	
	@Test
	public void whenInputIsNegTenThenReturnInvalidInput() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(-10);
		assertEquals("Invalid Input", testOutput);
	}
	
	@Test
	public void whenInputIsFifteenThenReturnFizzBuzz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(15);
		assertEquals("FizzBuzz", testOutput);
	}
	
	@Test
	public void whenInputIsThirtyThenReturnFizzBuzz() {
		FizzBuzzer underTest = new FizzBuzzer();
		String testOutput = underTest.fizzBuzz(30);
		assertEquals("FizzBuzz", testOutput);
	}
}
