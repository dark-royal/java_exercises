import java.util.Scanner;

public class State{

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter the state: ");
String state = input.next();

if(state == "Kebbi||Sokoto||Kastina||Zamfara||Kaduna||Kano"){
	System.out.print("NW");
}
if(state == "Adamawa||Yobe||Borno||Bauchi||Gombe||Taraba||Jigawa"){
	System.out.print("NE");
}

if(state == "Plateau||Kwara||Kogi||Benue||Niger||Nasarawa||FCT"){
	System.out.print("NC");
}

if(state == "Lagos||Ondo||Osun||Oyo||Ogun||Ekiti"){
	System.out.print("SW");
}

if(state == "Abia||Anambra||Ebonyi||Enugu||Imo"){
	System.out.print("SE");
}

if(state == "Bayelsa||Edo||Cross-River||Delta||Rivers||Akwa-Ibom"){
	System.out.print("SS");
}
	








}




}