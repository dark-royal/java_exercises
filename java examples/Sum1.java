import java.util.Scanner;

public class Sum1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number1;

int number2;

System.out.println("Enter first integer: ");
number1 = input.nextInt();

System.out.println("Enter second integer: ");
number2 = input.nextInt();

sum(number1, number2);
}

public static void sum(int num1, int num2){
	int total;

	total = num1 + num2;
	
	System.out.println("Total : " + total);


}






}