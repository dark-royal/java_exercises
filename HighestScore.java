import java.util.Scanner;

public class HighestScore{

public static void main(String[] args){

Scanner input = new Scanner(System.in);


int count = 0;
int highestScore = 0;
String highestName = " ";

System.out.println("Enter the number of student");
int numberOfStudent = input.nextInt();

while(count < numberOfStudent){
System.out.print("Enter the student name ");
String studentName = input.next();

System.out.print("Enter the student score ");
int score = input.nextInt();

	if(score > highestScore){
	highestScore = score;
	highestName = studentName;
}
        count++;
}
System.out.println("Highest Score is " + highestScore);
System.out.print("Highest name is "+ highestName);



}





}