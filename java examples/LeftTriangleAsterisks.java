//-----*
//----**
//---***
//--****
//-*****
//******

import java.util.Scanner;

public class LeftTriangleAsterisks{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

for(int count = 1; count <= number; count++){	
	for(int j = 1; j <= number; j++){
		for(int i = 1; i <= j; i++){
			System.out.print("-");
		}

		System.out.print("*");
	}

	System.out.println();
}




}


}