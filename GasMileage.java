import java.util.Scanner;

public class GasMileage{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter miles,enter -1 to stop: ");
int miles = input.nextInt();

int totalGallon = 0;
int totalMiles = 0;
int count = 0;
double milesPerGallon = 0;
int gallon = 0;
double totalMilesPerGallon = 0;

while(miles!= -1){
	totalMiles += miles;
	count = count + 1; 
	
		
	System.out.println("Enter gallon used: ");
	gallon = input.nextInt();
	totalGallon += gallon;
	

	 milesPerGallon = (double)miles / gallon;

	totalMilesPerGallon += milesPerGallon;
	

	System.out.printf("The miles per gallon is %.3f%n", milesPerGallon);

	
	
	
	System.out.println("Enter miles,enter -1 to stop: ");
	 miles = input.nextInt();
	}

  if(count != 0){
	System.out.printf("The total gallon is %d%n", gallon);
	System.out.printf("The total miles is %d%n",miles);
	System.out.printf("The total miles per gallon is %.3f",totalMilesPerGallon);
}

else{
	System.out.print("invalid");
}




 
}



}