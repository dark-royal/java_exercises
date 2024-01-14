import java.util.Scanner;

public class Extremes{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter values: (-1 to end)");
int values = input.nextInt();

int minimum = values ;

int maximum = 0;

int sum = 0;



while(values != -1){
	


	if(values > minimum){
	maximum = values;
	}
	
	 else{	
	 	minimum = values;
	}
	
	
	 values = input.nextInt();

	
}

System.out.printf("The maximum is %d%n", maximum);
System.out.printf("The minimum is %d%n", minimum);

sum = minimum + maximum;

System.out.printf("The sum of the two extreme is %d", sum);



	


}


}