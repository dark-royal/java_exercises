import java.util.Scanner;

public class PrimeNumbers{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

String answer = "";

System.out.println("Enter number: ");
int number = scanner.nextInt();

if(number < 0){
	System.out.println("it is an invalid input");
	number = scanner.nextInt();

}

for(int i = 1; i < number; i++){
	
	if(number % i == 0){
		answer = "It is  a prime number";
		
		}

	else{

		answer = "It is not a prime number";
		

	}
}

System.out.println(answer);



}





}