import java.util.Scanner;

public class NonDecreasingOrder{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter first integer");
int num1 = input.nextInt();

System.out.print("Enter second integer");
int num2 = input.nextInt();

System.out.print("Enter third integer");
int num3 = input.nextInt();

if(num1 > num2 && num2 > num3)
System.out.printf("%d  %d  %d\n", num3, num2, num1);

if(num2 > num3 && num3 > num1)
System.out.printf("%d  %d  %d\n", num1, num3, num2);

if(num3 > 1 && num1 > num2)
System.out.printf("%d  %d  %d\n",num2, num1, num3);


if(num1 > num3 && num3 > num2)
System.out.printf("%d  %d  %d\n",num2, num3, num1);

if(num2 > num1 && num1 > num3)
System.out.printf("%d  %d  %d\n",num3, num1, num2);

if(num3 > num2 && num2 > num1);
System.out.printf("%d  %d  %d\n",num1, num2, num3); 




}





}