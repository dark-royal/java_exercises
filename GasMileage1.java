import java.util.Scanner;

public class GasMileage1{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int miles = 0;
int gallon = 0;
double milesPerGallon = 0.0;
double totalMilesPerGallon = 0.0;
int totalMiles = 0;
int totalGallon = 0;
int count = 0;

System.out.println("Enter the miles(enter -1 to stop): ");
miles = input.nextInt();

while(miles != -1){
	totalMiles += miles;
	


	System.out.println("Enter the gallon: ");
	gallon = input.nextInt();
	totalGallon += gallon;
	count += 1;

	milesPerGallon =(double) miles / gallon;
	totalMilesPerGallon += milesPerGallon;

	System.out.printf("The miles per gallon is %.2f%n",milesPerGallon);

	count ++;
	

	System.out.println("Enter the miles(enter -1 to stop): ");
	miles = input.nextInt();
}

if(count != 0){
	System.out.printf("The total miles is %d%n", totalMiles);
	System.out.printf("The total gallon is %d%n", totalGallon);
	
	System.out.printf("The total miles per gallon is %.2f",totalMilesPerGallon);
}

else{
	System.out.println("no miles was inputed");
} 




}



}