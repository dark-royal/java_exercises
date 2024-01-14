import java.time.LocalDate;

import java.util.Scanner;

public class Checkout1{ 



/*private  static String[] product = new String[1];

   
private static int[] quantity = new int[1];

private  static double[] price = new double[1];*/

private final list<String> product = new ArrayList<>();
private final list<Int> quantity = new ArrayList<>();
private final list<Double> price = new ArrayList<>();


private static double total = 0.0;

private static  double discount = 0.0;
 
private  static String customerName = "";

private  static String cashierName = "";

private static int i = 0;




private static double subTotal;

private static double discountAmount;

private  static double vat;

private static  double billTotal;

private  static double amountPaid;

private static double balance;

private static Scanner input = new Scanner(System.in);


public static void main(String[] args){

LocalDate today = LocalDate.now();



collectInput();

calculateTotal();

subTotal();

discountAmount();

vat();

billTotal();

printReceipt();

amountPaid();

balance();

receipt();

}


public static void collectInput(){

System.out.println("what is the customer'sName");
	customerName = input.next();

 

for(int i = 0; i < product.length; i++){


	System.out.println("what did the user buy?" + (i + 1));
	product[i] = input.next();


	System.out.println("how many pieces?" + (i + 1));
	quantity[i] = input.nextInt();

	System.out.println("How much per unit?" + (i + 1));
	price[i] = input.nextInt();

	System.out.println("Add more items");
	String moreItem = input.next();
}
	

while(!moreItem.equalsIgnoreCase("no")){
	System.out.println("what did the user buy?" + (i + 1));
	product[i] = input.next();


	System.out.println("how many pieces?" + (i + 1));
	quantity[i] = input.nextInt();

	System.out.println("How much per unit?" + (i + 1));
	price[i] = input.nextInt();

	System.out.println("Add more items");
	String moreItem = input.next();
}


System.out.println("what is your name?");
	cashierName= input.next();

System.out.println("How much discount will he get?");
	discount= input.nextDouble();

}



public static double calculateTotal(){

for(int i = 0; i < quantity.length; i++){

 	total = quantity[i] * price[i];
	
	
}
return total;
} 


public static double subTotal(){

for(int i = 0; i < product.length; i++){
	subTotal += total;
	
}

return subTotal;
}

public static double discountAmount(){

	double discountAmount = (discount / 100)  * subTotal;

	return discountAmount;	
}

public static double vat(){

	double vat = (17.50 / 100) * subTotal;
	return vat;
		
}

public static double billTotal(){
	double billTotal = subTotal - (discountAmount + vat);
	return billTotal;
		
}
	

public static void printReceipt(){

System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION:312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL:08364537281
Date:%s%n
	""", LocalDate.now());

System.out.printf("Cashier:%s%n customerName:%s%n",cashierName, customerName);

System.out.println("====================================================================");


System.out.printf("		%5s%12s%9s%12s%n%n",  "ITEMS",  "QUANTITY", "PRICE", " TOTAL");

System.out.println("---------------------------------------------------------------------");


for(int i = 0; i < product.length; i++){

	System.out.printf("		%s%9d%9.2f%12.2f%n%n",  product[i],   quantity[i], price[i], total);


System.out.println("---------------------------------------------------------------------");

System.out.printf("""
		
		Sub total: %.2f%n
		
		Discount:%.2f%n

		VAT @ 17.50:%.2f%n
==================================================================================
		
		Bill total:%.2f%n

==================================================================================

	THIS IS NOT A RECEIPT KINDLY PAY %.2f
==================================================================================

	""", subTotal , discountAmount, vat, billTotal, billTotal);

}		

}
public static double amountPaid(){
System.out.println("How much did the user give to you?");
	 double amountPaid= input.nextInt();

return amountPaid;
		
}

public static double balance(){
double  balance = billTotal - amountPaid;
	return balance;
}

 
public  static void receipt(){

System.out.printf("""
SEMICOLON STORES
MAIN BRANCH
LOCATION:312, HERBERT MACAULAY WAY, SABO YABA, LAGOS.
TEL:08364537281
Date:%s%n 
	""", LocalDate.now());

System.out.printf("Cashier:%s%n customerName:%s%n",cashierName, customerName);

System.out.println("====================================================================");


System.out.printf("		%5s%12s%9s%12s%n%n",  "ITEMS",  "QUANTITY", "PRICE", " TOTAL");

System.out.println("---------------------------------------------------------------------");


for(int i = 0; i < product.length; i++){

	System.out.printf("		%s%12d%9f%12f%n%n",  product[i],   quantity[i], price[i],total);


System.out.println("---------------------------------------------------------------------");
 
System.out.printf("""
		
		Sub total: %.2f%n 
		
		Amount paid:%.2f%n

		Balance:%.2f%n
===============================================================
		
		THANK YOU FOR YOUR PATRONAGE

==================================================================================

""", subTotal, amountPaid, balance);



}
  

}




}