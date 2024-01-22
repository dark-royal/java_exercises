import java.util.Scanner;

public class Power{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number1: ");
int number1 = scanner.nextInt();

System.out.println("Enter number2: ");
int number2 = scanner.nextInt();

int power = 1;

for(int count = 1; count <= number1; count++){

	power *= number2;


}
System.out.println("The power is" + power);


}


}