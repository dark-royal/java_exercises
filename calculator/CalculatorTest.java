import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest{

	@Test
	public void testThatCalculatorCanAddTwoPositiveNumbers(){

		Calculator calculator = new Calculator();
		int sum = calculator.add(5,6);
		assertEquals(11, sum);


	

}





	@Test
	public void testThatCalculatorCanAddTwoNegativeNumbers(){

		Calculator calculator = new Calculator();
		int sum = calculator.add(-3, -2);
		System.out.println("sum is: " + sum);
		assertEquals(-5, sum);

	



}


@Test

public void testThatCanMultiplyTwoNumbers(){
	//1. Given

	Calculator calculator = new Calculator();
	//2. When
	int product = calculator.multiply(3 ,5);

	//3.Check
	assertEquals(15,product);

}


}