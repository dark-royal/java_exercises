import java.security.SecureRandom;
import java.util.Scanner;

public class Guess1{

public static void main(String[] args){

SecureRandom random = new SecureRandom();

int number = random.nextInt(1,11);

Scanner input = new Scanner(System.in);

System.out.println("Enter a guess");
int guess = input.nextInt();

if(guess < number){
	System.out.printf("Too low: random number is %d, guess is %d", number, guess);
}

else{
	if(guess > number){
		System.out.printf("Too high: random number is %d, guess is %d",  number, guess);
}

else{
	if(guess == number){
		System.out.printf("correct: random number is %d, guess is %d",  number, guess);
}
}
}



}





}