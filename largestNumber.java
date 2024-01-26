gvimport java.util.Scanner;

public class LargestNumber{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int counter = 0;
int largest = 0;


while (counter <= 10){

	System.out.println("Enter number: ");
	  int number = scanner.nextInt();


	if (number > largest){
	largest = number;

	}
	counter +=1;


}

System.out.printf("The largest is %d", largest);

}

}