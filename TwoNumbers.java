import java.util.Scanner;

public class TwoNumbers{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter  number");
int number = scanner.nextInt();

System.out.print("Enter power");
int power= scanner.nextInt();

/*int count = 0;

int digit = 1;

for numbers in range(2);

digit <= firstNumber;

count++*/

int total = 1;

for (int count = 1; count<= power; count++){
  total*= number;
  }

System.out.printf("The total is %d", total);














}




}