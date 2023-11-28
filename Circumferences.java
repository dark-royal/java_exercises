import java.util.Scanner;

public class Circumferences{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the radius ");
int radius = input.nextInt();

double pi = 3.14159;

int diameter = 2 * radius;

double circumference = 2 * pi * radius;

double area = pi * radius * radius;

System.out.printf("the diameter is %d%n", diameter);
System.out.printf("the circumference is %f%n",circumference);
System.out.printf("the area is %f",area);   








}




} 