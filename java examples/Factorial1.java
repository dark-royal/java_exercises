import java.util.Scanner;

public class Factorial1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

int x;

x = factorial(number);

System.out.println("Factorial : " + x);

}

public static int factorial(int num){

	int fact = 1;

	for(int count = 1; count <= num; count++){

		fact *= count;
	}

	return fact;



}

}