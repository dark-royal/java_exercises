import java.util.Scanner;

public class RockPaperScissors{
public static void main(String[] args){ 

Scanner input = new Scanner(System.in);

System.out.println("Enter the first player's name");
String name1 = input.nextLine();

System.out.println("Enter second player's name");
String name2 = input.nextLine();

System.out.println("Enter  first player's number");
int number1 = input.nextInt();

System.out.println("Enter second player's number");
int number2 = input.nextInt();

if(number1 > 0 && number2 <= 2){
 

if(number1 == 0 && number2 == 0)
System.out.print("both draw");

if(number1 == 1 && number2 ==1)
System.out.print("both draw");

if(number1 == 2 && number2 == 2)
System.out.print("they both draw");

if(number1 == 0 && number2 == 1)
System.out.print("first player one");

if(number1 == 1 && number2 == 0)
System.out.print("second player won");

if(number1 == 2 && number2 == 1)
System.out.print("first player won");

if(number1 == 1 && number2 == 2)
System.out.print("second player won");}

else{System.out.println("it is not part of the input for the game");
}

 








}








}
