import java.util.Scanner;

public class Validation{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;


System.out.println("Enter a number: ");
 int number = scanner.nextInt();

while(number > 2){

	if( number > 1 && number > 2 ){
	}

	System.out.println("Enter a number: ");
	 number = scanner.nextInt();

	count ++;

	}


}

}