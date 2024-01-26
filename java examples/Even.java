import java.util.Scanner;

public class Even{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

System.out.println(isEven(number));

}

public static boolean isEven(int number){
	
	if(number % 2 == 0){
		return true;
	}
	
	else{
		return false;

	}

//	return number;
}



}