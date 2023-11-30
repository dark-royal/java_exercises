import java.util.Scanner;

public class Item{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an item: ");
String item = input.next();

System.out.printf("Enter the price for %s: ", item);
double price = input.nextDouble();

while(price < 0.0){
System.out.printf("No credit,come tomorrow. Enter the price for %s: ", item);
price = input.nextDouble();
}

double discount = 0.1 * price; 

double grandTotal = price - discount;

System.out.printf("The item: %s%n",item);
System.out.printf("The price: %.2f%n", price);
System.out.printf("The discount: %.1f%n", discount);

System.out.printf("The grand total is %.1f", grandTotal);



}



}