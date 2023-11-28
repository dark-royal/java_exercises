import java.util.Scanner;

public class Game{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

int number = 0;

System.out.print("Enter a guess");
int guess = input.nextInt();

if(number == guess)
System.out.print("the guess is correct");

if(number != guess)
System.out.print("the guess is incorrect");





}





}