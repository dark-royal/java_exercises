import java.util.Scanner;

public class CreditLimitCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
int newBalance = 0;

System.out.println("Enter account number: ");
int accountNumber = scanner.nextInt();

while (accountNumber != -1){
	System.out.println("Enter the balance at the beginning of the month: ");
	int beginningBalance = scanner.nextInt();

	System.out.println("Enter the total of all item charged: ");
	int charges = scanner.nextInt();

	System.out.println("Enter total of all credit applied to the customer's account: ");
	int credit = scanner.nextInt();

	System.out.println("Enter allowed credit limit: ");
	int creditLimit = scanner.nextInt();

	newBalance = (beginningBalance - charges + credit);

	
	System.out.printf("The new balance of the month is %d%n", newBalance);


	if (newBalance > creditLimit ){
	System.out.println("credit exceeded limit");
	}
}

System.out.println("Enter account number: ");
	accountNumber = scanner.nextInt();








}


}