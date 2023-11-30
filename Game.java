//import java.security.SecureRandom;
import java.util.*;

public class Game{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

Random random = new Random();

int number = random.nextInt(0,2);

System.out.print("Enter a guess");
int guess = input.nextInt();

if(number == guess)
System.out.printf("the guess is correct: random is %d,guess is %d",number,guess);

if(number != guess)
System.out.printf("the guess is incorrect: random is %d, guess is %d", number,guess);



}





}