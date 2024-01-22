import java.util.Scanner;

public class SwitchDemo{

public static void main(String[] args){

char choice;

Scanner scanner = new Scanner(System.in);

System.out.println("Enter Y or N: ");
choice = scanner.next().charAt(0);

switch(choice){

case 'Y':
case 'y': 
 	System.out.println("You entered Y.");

break;

case 'N':
case 'n': 
	System.out.println("you entered N.");

default:
	System.out.println("Invalid input.");
}



}


}