import java.util.Scanner;

public class GuessNumber{

public static void main(String[] args){

int num;

int guess;

Scanner scanner = new Scanner(System.in);

num = (int) (Math.random() * 100 + 1);

do{
	System.out.println("Enter guess number");
	guess = scanner.nextInt();

	if(guess == num){
	
		System.out.println("You guessed the correct answer");
	}

	else if(guess < num){
		System.out.print("your guess is lower than number.\n Guess again!");

	}

	else{
		System.out.println("Your guess is higher than num.\nGuess again!");
	}

	}while(guess != num);
}


}