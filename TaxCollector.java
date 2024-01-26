import java.util.Scanner;

public class TaxCollector{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);
double taxRate = 0.0;

double totalTax = 0.0;

int count = 0;

while(count < 3){

	System.out.println("Enter customer name: ");
	String customerName = scanner.next();

	System.out.println("Enter customer earning: ");
	int earning = scanner.nextInt();



	if(earning <= 30000){
	taxRate = 0.15;
	totalTax = taxRate * earning;
	}

	else{
		taxRate = 0.20;
		totalTax = taxRate * earning;
	
	}

	

	System.out.printf("The customer name is %s%n", customerName);
	System.out.printf("The total tax is %.2f%n", totalTax);

count++;

}
	

	


	


}


}