import java.util.Scanner;

public class CreditCardValidator2Test{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Kindly enter what you would like to validate: ");
        	String number = scanner.next();
        	int theLength = number.length();

	generateCardLength();
	generateCardType();
	generateSecondDigit();
	checkValidity();
	printResult();
 


}


}