import java.util.Scanner;

public class Largest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int maximum  = 0;

System.out.println("Enter number1: ");
int number1 = scanner.nextInt();


System.out.println("Enter number2: ");
int number2 = scanner.nextInt();


System.out.println("Enter number3: ");
int number3 = scanner.nextInt();

if(number1 > number2){
	maximum = number1;
}

else if(number2 > number3){
	maximum = number2;
}

else{
	maximum = number3;

}
	
System.out.println("The largest number is" + maximum);

}
}