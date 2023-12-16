import java.util.Scanner;

public class ClassAverage{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

int total = 0;
int gradeCounter = 0;

System.out.println("Enter grade or -1 to stop: ");
int grade = input.nextInt();

while(grade != -1){
	total = total + grade;
	gradeCounter = gradeCounter + 1;

	System.out.println("Enter grade or -1 to stop: ");
	 grade = input.nextInt();

}

if (gradeCounter != 0){
	double average = total  / gradeCounter;
	System.out.printf("The total is %d",total);
	System.out.printf("The average is %f",average);
}

else{
	System.out.println("No grade was entered");
}



}


}