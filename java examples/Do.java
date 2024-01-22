import java.util.Scanner;

public class Do{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int sum = 0;

String choice = "";

do{

	System.out.println("Enter number1: ");
	int number1 = scanner.nextInt();

	System.out.println("Enter number2: ");
	int number2 = scanner.nextInt();

	sum = number1 + number2;

	System.out.println("The sum is " + sum);

	
	System.out.println("Do you wanna cotinue your program: ");
	choice = scanner.next();
	

}while(choice.equalsIgnoreCase("yes"));




}


}