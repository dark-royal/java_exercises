import java.util.Scanner;

public class TwoLargest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
int largest1 = 0;
int largest2 = 0;

while(count <= 10){

	System.out.println("Enter number");
	int number = scanner.nextInt();

	if (number > largest1){
	largest1 = number;
	}
	
	if(largest2 < largest1){
	largest2 = largest1;
	}

	count ++;

}

System.out.printf("The first largest is %d%n",largest1);
System.out.printf("The second largest is %d", largest2);

}


}