import java.util.Scanner;

public class OddOrEven{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

if(number % 2 == 0){
	System.out.println("it is an even number: ");
}

else{
	System.out.println("it is an odd number: "); 
}


}


}