import java.util.Scanner;

public class Cashier{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

String[] customer'sName  = new String[3];

String[] product = new String[3];
   
int[] quantity = new int[3];

int[] price = new int[3];

String[] name = new String[3];

int[] discount = new int[3];
 

for(int i = 0; i < customer'sName.length; i++){

	System.out.println("what is the customer'sName" + (1 + 1));
	customer'sName[i] = input.next();

	System.out.println("what did the user buy?" + (1 + 1));
	product[i] = input.next();

	System.out.println("how many pieces?" + (1 + 1));
	quantity[i] = input.nextInt();

	System.out.println("How much per unit?" + (1 + 1));
	price[i] = input.nextInt();

	System.out.println("what is your name?" + (1 + 1));
	name = input.next();

	System.out.println("How much discount will he get?" + (1 + 1));
	discount = input.next();


for(int i = 0; i < customer'sName.length; i++){

	System.out.printf("%s%n%s%n%s%n%s%n%s%n", "customer's name", "product", "quantity", "price", "discount");


	System.out.printf("%s%s%d%d%s%d%n", customer'sName[i], product[i], quantity[i], price[i], name[i], discount[i]);




}


}