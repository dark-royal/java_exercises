import java.util.Scanner;

public class Program{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer");
int num = input.nextInt();

if(num % 5==0 && num % 6 ==0) System.out.print("false");

if(num % 5 ==0 || num % 6 ==0) System.out.print("True");

if(num % 5 ==0  ^ num % 6 ==0) System.out.print("but not both? true"); 






	}




}