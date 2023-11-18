import java.util.Scanner;

public class Multiple{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");
int number = input.nextInt();

System.out.print("Enter second integer");
int number1 = input.nextInt();

int number2 = number * number * number;

int number3 = number1 * number1;

if(number2%number3 == 0){
System.out.print("it is a multiple");
}

else{
System.out.print("it is not a multiple");
}










	}





}