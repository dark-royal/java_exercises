import java.util.Scanner;

public class Digits{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter a number");
int number = scanner.nextInt();

int[] array = new int[number];

for(int i = 0; i < array.length - 1; i++){

	System.out.println(array[i]);

}



}



}