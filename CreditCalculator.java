import java.util.Scanner;

public class CreditLimitCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
int new balance = 0;

System.out.println("Enter account balance: ");
int accountBalance = scanner.nextInt();

while accountNumber != -1){
	System.out.println("Enter the balance at the beginning of the month: ");
	int beginningBalance = scanner.nextInt();

	System.out.println("Enter the total of all item charged: ");
	int charges = scanner.nextInt();

	System.out.println("Enter total of all credit applied to the customer's account: ");
	int credit = scanner.nextInt();

	System.out.prinntln("Enter allowed credit limit: ");
	int creditLimit = scanner.nextInt();

	newBalance = (beginningBalance - charges + credit);

	count ++;
	
	System.out.printf("The new balance of the month is %d", newBalance);

	System.out.println("Enter account balance: ");
	int accountBalance = scanner.nextInt();
}

if (newBalance > creditLimit){
	System.out.println("credit exceeded limit");
}





}


}