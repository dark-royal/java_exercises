import java.util.Scanner;

public class Comparator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
System.out.println("Enter number");
int number = scanner.nextInt();

System.out.println("Enter number");
int number1 = scanner.nextInt();



while (count >=2){
	
	System.out.println("Enter number");
	 number = scanner.nextInt();

	System.out.println("Enter number");
	 number1 = scanner.nextInt();

	count ++;


}

if (number == number1){
		System.out.println("0");
	}
	else if(number < number1){
		System.out.println("1");
	}

	else if(number > number1){
		System.out.println("-1");
	}




}

}