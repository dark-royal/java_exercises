import java.util.Scanner;

public class StudentGrade1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int countA = 0;
int countB = 0;
int countC = 0;
int countD = 0;



for(int count = 1; count <= 5; count++){
	System.out.println("Enter student name: ");
	String name = scanner.next();



	System.out.println("Enter student grade: ");
	String grade = scanner.next().toUpperCase();

	switch(grade){

		case "A": 

		++countA;
	
		break;


		case "B":

		++countB;
		break;

		case "C":
		++countC;
	
		break;
	
	
		case "D":
		++countD;

		break;

		default:
			System.out.println("Invalid grade");

	
	}
		//System.out.println("Enter student grade: ");
	//grade = scanner.next().toUpperCase();


	//System.out.println(name);
}

		System.out.printf("%s%n%d%n%s%n%d%n%s%n%d%n%s%n%d%n", "number Of Student With Grade  A: ", countA, "number Of Student With Grade B: ", countB, "number Of Student With Grade C: ", countC, "number Of Student With Grade D: ", countD);

	




}


}