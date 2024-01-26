import java.util.Scanner;

public class Guess{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter guess: ");
int guess = scanner.nextInt();

int count = 0;
int number;

number = (int) (Math.random(10) )  + 1;

while(guess != number){

	if(guess > number){
		System.out.println("Guess is higher \n Try again!");
	}

	else if(guess == number){
		System.out.println("Guess is correct.");
	}

	else if(guess < number){
		System.out.println("Guess is lower\n Try again!");
	}

	else{

		System.out.println("Invalid guess range");
	}

	System.out.println("Enter guess: ");
	guess = scanner.nextInt();

	count++;

}

}


}