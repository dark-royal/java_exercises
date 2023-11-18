import java.util.Scanner;

public class Area{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of x");
double number = input.nextDouble();

System.out.print("Enter the value of y");
double number1 = input.nextDouble();

System.out.print("Enter the value of x2");
double number2 = input.nextDouble();

System.out.print("Enter the value of y2");
double number3 = input.nextDouble();

System.out.print("Enter the value of x3");
double number4 = input.nextDouble();

System.out.print("Enter the value of y3");
double number5 = input.nextDouble();

double side1 = number - number1;

double side2 = number2 - number3;

double side3 = number4 - number5;

double totalNumberOfSides = side1 + side2 + side3;

double division = totalNumberOfSides / 2;

double subtraction1 = side1  - totalNumberOfSides;

double subtraction2 = side2 - totalNumberOfSides;

double subtraction3 = side3 - totalNumberOfSides;

double multiplication = subtraction1 * subtraction2 * subtraction3;

double multiplication1 = totalNumberOfSides * multiplication;

double squareRoot = (multiplication)**0.5;

System.out.printf("area is %f%n", squareRoot);  










 







	}





}