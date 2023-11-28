import java.util.Scanner;

public class Count2{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer,the input ends if is 0");
int number = input.nextInt();

int numberOfPositive = 0;
int numberOfNegative = 0;
double total = 0;
int count = 0;

while (number != 0){
if(number > 0){
numberOfPositive = numberOfPositive + 1;
}
if(number < 0){
numberOfNegative = numberOfNegative + 1;
}

total = total + number;
count = count + 1;

System.out.println("Enter an integer,the input ends if is 0");
number = input.nextInt();

}
double average = total / count;

System.out.print("The number of positive number is\n" + numberOfPositive);
System.out.print("The number of negative number is\n" + numberOfNegative);
System.out.print("The total is\n" + total);
System.out.print("The average is" + average); 



	
		





}






}