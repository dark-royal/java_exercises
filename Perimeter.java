import java.util.Scanner;

public class Perimeter{
public static void main{

Scanner input = new Scanner(System.in);

System.out.print("Enter three integers");

int edge1=input.nextInt();
int edge2 =input.nextInt(); 
int edge3 =input.nextInt(); 

int number1 = edge1 + edge2;
int number2 = edge1 + edge3;
int number3 = edge2 + edge3;

if(number1 > edge3  && number2 > edge2 && number3 > edge1);
System.out.print("input is valid");
else("input is invalid");








}







}