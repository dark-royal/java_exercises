import java.util.Scanner;

public class Product1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int number1 = 0;

int number2 = 0;

displayProduct(10, 3);
	
}

public static void displayProduct(int number1, int number2){

	int product = 0;


	for(int count = 0; count < number2; count++){

		product += number1;
	
	}

	System.out.println(product);
		

}

}