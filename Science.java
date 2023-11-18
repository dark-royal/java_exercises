import java.util.Scanner;

public class Science{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter amount of water in kilogram");
double amountOfWaterInKilogram = input.nextDouble();

System.out.print("Enter the initial temperatute");
double initialTemperature = input.nextDouble();

System.out.print("Enter the final temperature");
double finalTemperature = input.nextDouble();

int number = 4184;

double result = amountOfWaterInKilogram * (finalTemperature - initialTemperature) * number;

System.out.printf("science is %f%n", result);













	}






}