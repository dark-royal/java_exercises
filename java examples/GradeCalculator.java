import java.util.Scanner;

public class GradeCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the subject mark of the student");
int subject1 = scanner.nextInt();
int subject2 = scanner.nextInt();
int subject3 = scanner.nextInt();

int average = subject1 + subject2 + subject3 / 3;

switch(average / 10){

case 9:
case 10: 
	System.out.println("A");
break;

case 8:
	 
	System.out.println("B");
break;

case 7:
	System.out.println("c");

break;

case 6:
	
	System.out.println("D");
break;

//default:

	//System.out.println("F");
}

}


}