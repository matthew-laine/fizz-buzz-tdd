import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class FizzBuzzerTest {

	FizzBuzzer underTest;
	
	private void testFizzBuzzer(FizzBuzzer underTest, String expectedResult, int fizzBuzzNumber) {
		String actualResult = underTest.fizzBuzz(fizzBuzzNumber);
		assertEquals(expectedResult, actualResult );
	}

	@Before
	public void initialize() {
		underTest = new FizzBuzzer();
	}

	@Test
	public void whenInputIsZeroReturnInvalidInput() {
		testFizzBuzzer(underTest, "Invalid Input", 0);
	}

	@Test
	public void whenInputIsOneThenReturnOne() {
		testFizzBuzzer(underTest, "1", 1);
	}

	@Test
	public void whenInputIsTwoThenReturnTwo() {
		testFizzBuzzer(underTest, "2", 2);
	}

	@Test
	public void whenInputIsThreeThenReturnFizz() {
		testFizzBuzzer(underTest, "Fizz", 3);
	}

	@Test
	public void whenInputIsSixThenReturnFizz() {
		testFizzBuzzer(underTest, "Fizz", 6);
	}

	@Test
	public void whenInputIsFiveThenReturnBuzz() {
		testFizzBuzzer(underTest, "Buzz", 5);
	}

	@Test
	public void whenInputIsTenThenReturnBuzz() {
		testFizzBuzzer(underTest, "Buzz", 10);
	}

	@Test
	public void whenInputIsNegTenThenReturnInvalidInput() {
		testFizzBuzzer(underTest, "Invalid Input", -10);
	}

	@Test
	public void whenInputIsFifteenThenReturnFizzBuzz() {
		testFizzBuzzer(underTest, "FizzBuzz", 15);
	}

	@Test
	public void whenInputIsThirtyThenReturnFizzBuzz() {
		testFizzBuzzer(underTest, "FizzBuzz", 30);
	}
}
