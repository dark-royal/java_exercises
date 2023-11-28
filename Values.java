import java.util.Scanner;

public class Values{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int negativeNumbers = 0;
int positiveNumbers = 0;
int zeroNumbers = 0;


System.out.print("Enter first number");
int num1 = input.nextInt();

System.out.print("Enter second number");
int num2 = input.nextInt();

System.out.print("Enter third number");
int num3 = input.nextInt();

System.out.print("Enter fourth number");
int num4 = input.nextInt();

System.out.print("Enter fifth number");
int num5 = input.nextInt();

if(num1 < 0)
negativeNumbers = negativeNumbers + 1;

if(num2 < 0)
negativeNumbers = negativeNumbers + 1;

if(num3 < 0)
negativeNumbers = negativeNumbers + 1;

if(num4 < 0)
negativeNumbers = negativeNumbers + 1;

if(num5 < 0)
negativeNumbers = negativeNumbers + 1;


if(num1 > 0)
positiveNumbers = positiveNumbers + 1;

if(num2 > 0)
positiveNumbers = positiveNumbers + 1;

if(num3 > 0)
positiveNumbers = positiveNumbers + 1;

if(num4 > 0)
positiveNumbers = positiveNumbers + 1;

if(num5 > 0)
positiveNumbers = positiveNumbers + 1;


if(num1 == 0)
zeroNumbers = zeroNumbers + 1;

if(num2 == 0)
zeroNumbers = zeroNumbers + 1;

if(num3 == 0)
zeroNumbers = zeroNumbers + 1;

if(num4 == 0)
zeroNumbers = zeroNumbers + 1;

if(num5 == 0)
zeroNumbers = zeroNumbers + 1;

System.out.println();
System.out.printf("The negative numbers is %d%n", negativeNumbers);
System.out.printf("The positive numbers is %d%n", positiveNumbers);
System.out.printf("The zero numbers is %d%n", zeroNumbers);











}





}