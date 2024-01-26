import java.util.Scanner;

public class BarChartPrintingProgram{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;

for(int i = 1; i < 5; i++){
	System.out.println("Enter a number: ");
	int number = scanner.nextInt();

			
	if(number >= 1 && number <= 30){
		for(int j = 1; j < i; i++){
			System.out.print("*");
		}

			System.out.println();
	}

	else{
		System.out.println("invalid number");
	}

	count++;

}
		




}


}