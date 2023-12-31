import java.util.Scanner;

public class Checkout{




String[] product = new String[2];

   
int[] quantity = new int[2];

double[] price = new double[2];

double [] total = new double[1];

int discount = 0;

String customerName = null;

String cashierName = null;



int i = 0;


private double subTotal;

private double discountAmount;

private double vat;

private double billTotal;

private double amountPaid;

private double balance;

Scanner input = new Scanner(System.in);



public static void main(String[] args){

Checkout checkout = new Checkout(); 

checkout. collectInput();

checkout.total();

checkout.subTotal();

checkout.discountAmount();

checkout.vat();

checkout.billTotal();

checkout.printReceipt();

checkout.amountPaid();

checkout.balance();

checkout.Receipt();

}


public void collectInput(){

System.out.println("what is the customer'sName");
	customerName = input.next();

 

for(int i = 0; i < product .length; i++){


	System.out.println("what did the user buy?" + (i + 1));
	product[i] = input.next();


	System.out.println("how many pieces?" + (i + 1));
	quantity[i] = input.nextInt();

	System.out.println("How much per unit?" + (i + 1));
	price[i] = input.nextInt();

	

}

System.out.println("Add more items");
String moreItem = scanner.next();

while(moreItem == "yes"){

	System.out.println("what did the user buy?" + (i + 1));
	product[i] = input.next();


	System.out.println("how many pieces?" + (i + 1));
	quantity[i] = input.nextInt();

	System.out.println("How much per unit?" + (i + 1));
	price[i] = input.nextInt();

	
}


System.out.println("what is your name?");
	cashierName= input.next();

System.out.println("How much discount will he get?");
	discount= input.nextInt();

}

public void total(){

for(int i = 0; i < quantity.length; i++){

	total = quantity[i] * price[i];
}
}

public void subTotal(){

for(int i = 0; i < total.length; i++){
	 subTotal += total[i];
}
}

public void discount(){

	discountAmount = (discount / 100)  * subTotal;
}

public void vat(){

	vat = (17.50 / 100) * subTotal;
}

public void billTotal(){
	billTotal = subTotal - (discountAmount + vat);
}

public void amountPaid(){

System.out.println("How much did the customer give you?");
amountPaid = checkout.nextDouble();

}

public void printReceipt(){

System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION:312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL:08364537281
Date:23K482892%n""");

System.out.printf("Cashier:%s%n customerName:%s%n",cashierName, customerName);

System.out.println("====================================================================");


System.out.printf("		%5s%12s%9s%12s%n%n",  "ITEMS",  "QUANTITY", "PRICE", " TOTAL");

System.out.println("---------------------------------------------------------------------");


for(int i = 0; i < product.length; i++){

	System.out.printf("		%s%12d%9f%12f%n%n",  product[i],   quantity[i], price[i],total[i]);


System.out.println("---------------------------------------------------------------------");

System.out.printf("""
		
		Sub total: "%d%n", subTotal
		
		Discount:"%.2f%n", discountAmount

		VAT @ 17.50:"%.2f%n", vat
==================================================================================
		
		Bill total:"%.2f%n", billTotal

==================================================================================

	THIS IS NOT A RECEIPT KINDLY PAY "%.2F", billTotal
==================================================================================

	""");

}		

}



  






}