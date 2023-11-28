import java.util.Scanner;

public class Lottery1{
public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter three digit number:(lottery number");
int lottery = scanner.nextInt();

System.out.print("Enter a guess");
int guess = scanner.nextInt();


int lotteryNumber = lottery / 100;
int lotteryRemainder = lottery % 100;

int guessNumber = guess / 100;
 int guessRemainder = guess % 100;

if(lottery == guess){
System.out.print("exact match,the reward is $10000");
}

else if(guessRemainder == lotteryNumber && guessNumber == lotteryRemainder){
System.out.print("match all digit:the reward is $3000");
}

else if(guessNumber == lotteryNumber || guessNumber == lotteryRemainder|| guessRemainder == lotteryNumber || guessRemainder == lotteryRemainder){
System.out.print("match a digit:the award is $1000");
}












}





}