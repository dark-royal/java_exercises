import java.util.Scanner;

public class Grade3{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter grade");
int grade = input.nextInt();

if(grade >= 60){
	System.out.println("passed");
}

else{
	System.out.println("failed");
	System.out.println("you must take this course again ");
}




}




}