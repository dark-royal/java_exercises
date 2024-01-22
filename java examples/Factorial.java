import java.util.Scanner;

public class Factorial{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number");
int number = scanner.nextInt();

int num = 1;

for(int count = number; count >= 1; count--){
	num *= count;

	

}

System.out.println("The factorial is " + num);	

}


}