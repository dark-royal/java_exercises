import java.util.Scanner;

public class Conversion{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter degree celcius");
double number = input.nextDouble();

double result = (9.0 / 5) * number + 32; 

System.out.printf("%.1f celcius is %.1f fahrenheit", number, result);







	}



}