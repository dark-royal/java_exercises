import java.util.Scanner;

public class Financial{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter the balance");
int balance = scanner.nextInt();

System.out.print("Enter the annual interest rate");
double annualInterestRate = scanner.nextDouble();

int number =1200;

double result = balance * (annualInterestRate / number);

System.out.printf("financial is %f%n", result);










	}





}