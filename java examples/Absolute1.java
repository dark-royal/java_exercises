import java.util.Scanner;

public class Absolute1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int absolute = 0;

System.out.println("Enter number: ");
int number = scanner.nextInt();


if(number < 0){
	absolute = (number * - 1);
	System.out.println("The absolute value is" + absolute);

}

if(number > 0){
	absolute = number * 1;
	System.out.println("The absolute value is" + absolute);


}






}


}