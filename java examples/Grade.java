import java.util.Scanner;

public class Grade{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter garde: ");
String grade = scanner.next();

switch(grade){

case "a":
case "A":
	System.out.println("Excellent");
break;

case "b":
case "B":

	System.out.println("Good");
break;

case "c": 
case "C":

	System.out.println("Average");
break;

case "d":
case "D":
	System.out.println("Deficient");
break;

case "f":
case "F":

	System.out.println("Failing");
break;

default:
	System.out.println("Invalid grade");

}

}

}