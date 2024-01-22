import java.util.Scanner;

public class PrimeNumber{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

boolean answer = true;


for(int count = 2; count < number; count++){
	if(number % count == 0){
		
		answer = false;
		break;
	}

}

if(answer && number > 1){

	System.out.println("it is  a prime number");
}

else{

	System.out.println("it is not a prime number");
}


}


}