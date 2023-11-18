import java.util.Scanner;

public class Comparing{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number3 = 100;

System.out.print("Enter an integer");
int number = input.nextInt();

int number2 = number * number;

int numberAndItsSquare = number + number2;

if(numberAndItsSquare == number3)
System.out.printf("%d == %d%n", numberAndItsSquare , number3);

if(numberAndItsSquare != number3)
System.out.printf("%d != %d%n", numberAndItsSquare , number3);

if(numberAndItsSquare < number3)
System.out.printf("%d < %d%n", numberAndItsSquare , number3);

if(numberAndItsSquare > number3)
System.out.printf("%d > %d%n", numberAndItsSquare , number3);

 






	}



}   