import java.util.Scanner;

public class CarApplicationTest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

Car car1 = new Car("Corola","1999",230.00);

Car car2 = new Car("Porsche","2002",1900000.00);


System.out.println("Enter the first car price");
double price1 = scanner.nextDouble();

System.out.println("Enter the second car price");
double price2 = scanner.nextDouble();


double price3 = price1 * 5/100;
double price4 = price2 * 7/100;

System.out.printf("The Corola price is %.2f%n", price3);
System.out.printf("The Porsche price is %.2f", price4);



}






}