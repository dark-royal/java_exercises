import java.util.Scanner;

public class SalesCommissionCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
double moneyReceivedEveryWeek = 200.0;
double percentageAmount = 0.9;
int totalItemSold = 0;
double totalItemValue = 0.0;
double salesPersonEarning = 0.0;
double percentageAmountReceived = 0.0;
double totalSalesPersonEarning = 0.0;
System.out.println("Enter item sold(enter -1 to quit): ");
int itemSold = scanner.nextInt();

while (itemSold != -1){
	totalItemSold += itemSold;
	
	System.out.println("Enter the value of the item sold: ");
	double itemValue = scanner.nextDouble();
	totalItemValue += itemValue;

	percentageAmountReceived = percentageAmount * totalItemValue;
	
	salesPersonEarning = percentageAmountReceived * moneyReceivedEveryWeek;
	totalSalesPersonEarning += salesPersonEarning;
	
	System.out.println("Enter item sold(enter -1 to quit): ");
	itemSold = scanner.nextInt();
	
	 
	count ++;
	
	}

System.out.printf("The total item sold is %d%n",totalItemSold);
System.out.printf("The total item value is %.2f%n",totalItemValue);
System.out.printf("The sales person earning is %.2f",salesPersonEarning);

	





}

}