import java.util.Scanner;

public class Multiply{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a number");
int number = input.nextInt();

int count =  1;


	if(number < 1 || number > 12){
		System.out.println("invalid number");
		
	}else      {   while(count <= 12){
		int number2 = number * count;
                System.out.printf("%d X %d = %d%n", number, count, number2 );
		count++;
		}

}


}





}