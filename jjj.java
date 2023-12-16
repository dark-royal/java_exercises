import java.util.Scanner;

public class State1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your state: ");
String state = scanner.next();


switch(state){

	case "Kebbi":"Sokoto":"Katsina":"Kano":"Kaduna":"Zamfara";
		System.out.println("You are from north west");
		
	case "Borno":"Adamawa":"Yobe":"Taraba":"Gombe":"Jigawa":"Bauchi";
		
		System.out.println("You are from north east");

	case "Kogi":"Kwara":"Plateau":"Niger":"Benue":"FCT":"Nasarawa";
		System.out.println("You are from north central");

	case "Ogun":"Osun":"Ondo":"Oyo":"Lagos":"Ekiti";
		System.out.println("You are from south west");

	case "Anambra":"Abia":"Enugu":"Ebonyi":"Imo";
		System.out.println("You are from north east");
}


}





}