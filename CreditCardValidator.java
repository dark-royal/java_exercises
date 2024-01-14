import java.util.Scanner;

public class CreditCardValidator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Kindly Enter card details to verify");
long cardNumber = scanner.nextLong();

long reverse = 0;

long temp = cardNumber;

while(temp != 0){               

	long digit = temp % 10;
	
	reverse = reverse * 10 + digit;

	temp = temp / 10;

	if(cardNumber == reverse){

		System.out.println(cardNumber + "  ");

		}

	}


}


}