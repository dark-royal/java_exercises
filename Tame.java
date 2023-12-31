import java.util.Scanner;
public class Tame{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);


int count = 0;
int total = 0;

System.out.println("Enter number(input -1 to end)");
int number = scanner.nextInt();

while(number != -1){
	total += number;

	System.out.println("Enter number(input -1 to end)");
	number = scanner.nextInt();

	count++;
}

System.out.printf("The sum is %d", total);






}


}