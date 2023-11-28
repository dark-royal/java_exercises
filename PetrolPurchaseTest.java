import java.util.Scanner;

public class PetrolPurchaseTest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

PetrolPurchase petrolPurchase = new PetrolPurchase("ota","gas", 100, 700.0, 10);

System.out.println("Enter the price");
double pricePerLiter = scanner.nextDouble();
petrolPurchase.setPricePerLiter(700);
petrolPurchase.getPricePerLiter();


System.out.println("Enter the quantity");
int quantity = scanner.nextInt();
petrolPurchase.setQuantity(100);
petrolPurchase.getQuantity();

System.out.print("Enter the percentageDiscount");
double discount = scanner.nextDouble();
petrolPurchase.setPercentageDiscount(10);
petrolPurchase.getPercentageDiscount();

double purchaseDiscount = 700 * 0.1; 
double netPurchaseAmount = (100 * 700) - discount;

System.out.printf("netPurchaseAmount is %.2f",netPurchaseAmount);
























}









}