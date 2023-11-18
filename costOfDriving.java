import java.util.Scanner;

public class Costofdriving{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the driving distance");
double drivingDistance = input.nextDouble();

System.out.print("Enter the miles per gallon");
double milesPerGallon = input.nextDouble();

System.out.print("Enter price per gallon");
double pricePerGallon = input.nextDouble();

double costOfTrip = drivingDistance / milesPerGallon / pricePerGallon;

System.out.printf("costOfDriving is %f%n", costOfTrip); 

 










	}








}