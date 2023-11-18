import java.util.Scanner;

public class Bmi1{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in kilogram");
double weightInKilogram = input.nextDouble();

System.out.print("Enter the height in meter");
double heightInMeter = input.nextDouble();

double num = heightInMeter * heightInMeter;

double result = weightInKilogram / num;

System.out.printf("bmi is %f%n", result);

if(result <  18.5)
System.out.print("bmi categories : under weight");

if (result > 18.5 && result <  24.9)
System.out.print("bmi categories: healthy range");

if(result > 25 && result < 29.9)
System.out.print("bmi categories : over weight");

if(result > 30 && result < 39.9)
System.out.print("bmi categories : obesity");

if(result > 40 )
System.out.print("bmi Categories : severe obesity");
 






 
	}
}