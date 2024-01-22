import java.util.Scanner;

public class Positive{ 

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

if(number > 0){
	System.out.println("Number is positive.");
}

else if(number < 0){
	System.out.println("Number is negative.");
}

else{
	System.out.print("Number is zero.");
}



}

}