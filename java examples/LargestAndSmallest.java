import java.util.Scanner;

public class LargestAndSmallest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

int largest = 0;

int smallest = number;

int count = 0;

while(number != -1){

	if(number > largest){

		largest = number;
}

	if(number < smallest){

		smallest = number;
}
	System.out.println("Enter number: ");
	number = scanner.nextInt();

	count++;
}

System.out.println("The largest is " + largest);

System.out.println("The smallest is " + smallest);
	

}


}