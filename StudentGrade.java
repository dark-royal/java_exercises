import java.util.Scanner;

public class StudentGrade{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int score = 0;

System.out.println("How many student do you have");
int number = scanner.nextInt();
int[] numbers = new int[number];

System.out.println("How many subject do they offer");
int sub = scanner.nextInt();
int[] subject = new int[sub];


System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully");


for(int i = 0; i < numbers.length; i++){

	System.out.println("Entering the scores for student" + (i));

	System.out.println("Enter the scores for subject"  + (i + 1));
	score = scanner.nextInt();


	System.out.println("Saving>>>>>>>>>>>>>>>>>>>>>>>>\nSaved successfully");

}



	



}



}