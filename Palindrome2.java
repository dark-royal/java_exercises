import java.util.Scanner;

public class Palindrome2{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter number: ");
int number = scanner.nextInt();

int reverseNum = 0;

int temp = number;

while (temp != 0){
	int digit = temp % 10;
	
	reverseNum = reverseNum * 10 + digit;

	temp = temp / 10;
}

	if(number == reverseNum){
		System.out.println("It is a palindrome number");
}

	else{
		System.out.println("It is not  a palindrome number");

}


	




}

}