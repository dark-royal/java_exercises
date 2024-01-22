import java.util.Scanner;

public class RevenueAndDiscount{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

double discount = 0.0;

double netRevenue = 0.0;

System.out.println("Enter price: ");
double price = scanner.nextDouble();

System.out.println("Enter quantity: ");
int quantity = scanner.nextInt();

double revenue = price * quantity;

if(revenue > 5000){
	discount = 0.10 * revenue;
	netRevenue = revenue - discount;
	
	System.out.println("The discount is" + discount);
	System.out.println("The net revenue is" + netRevenue);

}

else{
	System.out.println("The revenue is" + revenue);

}	






}


}