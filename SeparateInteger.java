import java.util.Scanner;

public class SeparateInteger{
public static void  main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter five digit number");
int number = input.nextInt();

int number1 = number / 10000;
int remainder = number % 10000;

int number2 = remainder / 1000;
remainder = remainder % 1000;

int number3 = remainder / 100;
remainder = remainder % 100;

int number4 = remainder / 10;
remainder = remainder % 10;

int number5 = remainder / 1;
remainder = remainder % 1;

System.out.printf("%d   %d   %d   %d   %d", number1, number2 ,number3,
number4, number5);









}













}