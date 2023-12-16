import java.util.Scanner;

public class State1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your state: ");
String state = scanner.next();


switch(state.toUpperCase()){

	case "KEBBI","SOKOTO","KATSINA","KANO","KADUNA","ZAMFARA"->
		System.out.println("You are from north west");
		
	case "BORNO","ADAMAWA","YOBE","TARABA","GOMBE","JIGAWA","BAUCHI"->
		
		System.out.println("You are from north east");

	case "KOGI","KWARA","PLATEAU","NIGERIA","BENUE","FCT","NASARAWA"->
		System.out.println("You are from north central");

	case "OGUN","OSUN","ONDO","OYO","LAGOS","EKITI"->
		System.out.println("You are from south west");

	case "ANAMBRA","ABIA","ENUGU","EBONYI","IMO"->
		System.out.println("You are from north east");
}


}





}