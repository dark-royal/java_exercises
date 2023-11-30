import java.util.Scanner;

public class Counter{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int total = 0;
int gradeCounter = 1;

while(gradeCounter <= 10){
	System.out.println("Enter the next grade");
	int nextGrade = scanner.nextInt();
		total = nextGrade + total;
		gradeCounter = gradeCounter + 1;
}
int sum = total;
int average = total / gradeCounter;
System.out.print("The total is\n" + total);
System.out.print("The average is\n" + average);

 




}


}