import java.util.Scanner;

public class Factorial{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Entre any postive number: ");
int number = scanner.nextInt();

int num1 = 1;


for(int count = number; count >= 1 ; count--){

	if(number >= 1 && number <= 20){
		num1 *= count;
	}
		System.out.println(num1);
	




}

		
		
		


}


}