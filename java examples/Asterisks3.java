import java.util.Scanner;

public class Asterisks3{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

for(int i = number; i >= 1 ; i--){
	for(int j = 1; j <= i; j++){
		System.out.print("*");
	}
	
	System.out.println();
}

}

}