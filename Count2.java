import java.util.Scanner;

public class Count2{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer,the input ends if is -1");
int number = input.nextInt();

int numberOfPositive = 0;
int numberOfNegative = 0;
int numberOfZero = 0;

int count = 0;

while (number != -1){
if(number > 0){
numberOfPositive = numberOfPositive + 1;
}
if(number < 0){
numberOfNegative = numberOfNegative + 1;
}

if(number == 0){
numberOfZero = numberOfZero + 1;
}



count = count + 1;

System.out.println("Enter an integer,the input ends if is -1");
number = input.nextInt();

}

System.out.printf("The number of positive number is %d%n", numberOfPositive);
System.out.printf("The number of negative number is %d%n", numberOfNegative);
System.out.printf("The number of zero number is %d", numberOfZero);


	
		





}






}