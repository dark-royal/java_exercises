import java.util.Scanner;

public class CheckOut{

String[] product = new String[2];
  
int[] quantity = new int[2];

double[] price = new int[2];

private double vat;

private double discount;

private double subTotal;

private String collectInput;

private String cashierName;

private String customerName;

private double billTotal;

private double checkBalance;

private double amountPaid;

Scanner input = new Scanner(System.in);


public static void main(String[] args){

public void collectInput();

public void total();

public void subTotal();

public void discount();

public void vat();

public void billTotal();

public void amountPaid();

public void printReceipt1();

public void balance();

public void printReceipt();


}

public void collectInput(){

System.out.println("what is the customer name");
String customerName = scanner.next();

for(i = 0; i < product.length; i++){

	System.out.println("What did the user buy?");
	product[i] = scanner.next();

	System.out.println("How many pieces?");
	quantity[i] = scanner.nextInt();

	System.out.println("How much per unit");
	price[i] = scanner.nextDouble();

}


}


	






