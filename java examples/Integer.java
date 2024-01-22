import java.util.Scanner;

public class Integer{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);


int oddSum = 0;

int evenSum = 0;

int count = 0;

System.out.println("Enter number: ");
int number = scanner.nextInt();


while(number != -1){
	System.out.println("Enter number: ");
	number = scanner.nextInt();

	if(number % 2 == 0){
		evenSum += 1;

	}

	else if(number % 2 != 0){
		oddSum += 1;
	}
count ++;


}

System.out.println("sum of odd is " + evenSum);
System.out.println("sum of even is " + oddSum);
	



}


}