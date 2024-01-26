import org.junit.jupiter.api.Test;
import static org.junit.jupiter.aoi.Assertions.*;
public class EvenTest{

	@Test
	public void testEvenMethod(){
//		Even evenNumbers = new Even();
		int givenValue = 90;
		boolean gottenValue = Even.isEven(givenValue);
		assertTrue(true, gottenValue);

	}




}