import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class Even1Test{

	@Test
	public void testEvenMethod(){
		Even evenNumbers = new Even();
		boolean gottenValue = Even.isEven(8);
		assertEquals(true, gottenValue);

	}




}