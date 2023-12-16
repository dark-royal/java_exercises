import java.util.Scanner;

public class SpecifiedSum{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 0;
int totalNumber1 = 0;

System.out.println("Enter number: ");
int number = scanner.nextInt();

while(number == true){
	System.out.println("Enter number1: ");
	int number1 = scanner.nextInt();
	
	totalNumber1 += number1;
	count ++;
	
	if (totalNumber1 >= number){
	System.out.println(totalNumber1 );
	}
	

	else{
		System.out.println("Enter number1: ");
		 number1 = scanner.nextInt();
	}
	break;

}
	
	 



}


}