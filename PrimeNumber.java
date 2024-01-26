import java.util.Scanner;

public class PrimeNumbers{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

for(int i = 1; i <= number; i++){
	if(number < 0){
		System.out.println("it is an invalid input");
	}
	
	if(number % i == 0){
		System.out.println("It is a prime number")

		}

	else{

		System.out.println("It is not a prime number");

	}



}





}