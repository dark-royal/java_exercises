import java.util.Scanner;

public class PetrolPurchase1Test{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

PetrolPurchase1 petrolPurchase1 = new PetrolPurchase1();

System.out.println("Enter the price: ");
double pricePerLiter = input.nextDouble();
petrolPurchase1.setPricePerLiter(34.4);
petrolPurchase1.getPricePerLiter();

System.out.println("Enter the quantity: ");
int quantity = input.nextInt();
petrolPurchase1.setQuantity(180);
petrolPurchase1.getQuantity();

System.out.println("Enter the percentageDiscount: ");
double discount = input.nextDouble();
petrolPurchase1.setPercentageDiscount(0.5);
petrolPurchase1.getPercentageDiscount();




System.out.printf("the net purchase amount is %.2f",petrolPurchase1.getNetPurchaseAmount);






}



}