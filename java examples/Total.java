import java.util.Scanner;

public class Total{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number1: ");
int number1 = scanner.nextInt();

System.out.println("Enter number2: ");
int number2 = scanner.nextInt();

getTotal(number1, number2);

}


public static int getTotal(int num1, int num2){

	int total = num1 + num2;

	System.out.println("sum is : " + total);


	return total;
}
}