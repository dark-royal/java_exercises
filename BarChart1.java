import java.util.Scanner;

public class BarChart1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int number = 0;

for(int count = 1 ; count <= 5; count++){
	System.out.println("Enter number: ");
	 number = scanner.nextInt();
	if(number >= 1 && number <= 30){

		for(int i = 1; i <= number; i++){
			System.out.print("*");
	}

	}

	else{
		System.out.println("invalid input");
	}

}




}

}