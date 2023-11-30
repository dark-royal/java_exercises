import java.util.Scanner;

public class Absolute{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

int absoluteValue = 0;
if(number < 0)
	absoluteValue =( number * -1);
	System.out.print("The absolute value is" + absoluteValue);

if(number > 0)
	absoluteValue =( number * 1);

	System.out.print("The absolute value is" + absoluteValue);
	





}




}