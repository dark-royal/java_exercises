import java.util.Scanner;

public class Count{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

int positiveCount = 0;

int negativeCount = 0;

int zeroCount = 0;

int count = 0;



while(number != -1){


	if(number < 0){
		negativeCount += 1;
	
	}

	else if(number > 0){
		positiveCount += 1;

	}

	else{

		zeroCount += 1;
	}

	System.out.println("Enter number: ");
	number = scanner.nextInt();

	count++;
	
}

System.out.println("NUmber of positive is"  + positiveCount);

System.out.println("Number is negative is " + negativeCount);

System.out.println("Number of zero is " + zeroCount);
	

	




}


}