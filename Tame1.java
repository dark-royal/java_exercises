import java.util.Scanner;
public class Tame1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int number;
int total = 0;

do{
	System.out.println("Enter number(input -1 to end)");
	 number = scanner.nextInt();

	total += number;

} while(number != -1);
	System.out.printf("The sum is %d", total);


	
}


}
