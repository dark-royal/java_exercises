import java.util.Scanner;

public class Largestandsmallest{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first number");
int num1 = input.nextInt();

System.out.print("Enter second number");
int num2 = input.nextInt();

System.out.print("Enter third number");
int num3 = input.nextInt();

System.out.print("Enter four number");
int num4 = input.nextInt();

System.out.print("Enter five number");
int num5 = input.nextInt();

if(num1 < num2 && num1 < num3 && num1 < num4 && num1 < num5)
System.out.print("smallest number" + num1);

if(num2 < num1 && num2 < num3 && num2 < num4 && num2 < num5)
System.out.print("smallest number" + num2);

if(num3 < num1 && num3 < num2 && num3 < num4 && num3 < num5)
System.out.print("smallest number" + num3);

if(num4 < num1 && num4 < num2 && num4 < num3 && num4 < num5)
System.out.print("smallest number" + num4);

if(num5 < num1 && num5 < num2 && num5 <num3 && num5 < num4)
System.out.print("smallest number" + num5);


if(num1 > num2 && num1 > num3 && num1 > num4 && num1 > num5)
System.out.print("largest number" + num1);

if(num2 > num1 && num2 > num3 && num2 > num4 && num2 > num5)
System.out.print("largest number" + num1);

if (num3 > num1 && num3 > num2 && num3 > num4 && num3 > num5)
System.out.print("largest number" + num3);

if(num4 > num1 && num4 > num2 && num4 > num3 && num4 > num5)
System.out.print("largest number" + num4);

if(num5 > num1 && num5 > num2 && num5 > num3 && num5 > num4)
System.out.print("largest number" + num5);									





	}









}