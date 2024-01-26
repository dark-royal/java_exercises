public class PassingArgument{


public static void main(String[] args){

int x = 30;

System.out.println("Display line of 50 characters");
displayLine(50);
System.out.println("Display line of 30 character");
displayLine(x);
}

public static void displayLine(int n){
	for(int i = 1;  i <= n; i++){
		System.out.print("_");
	}

	System.out.println(" ");


}
}
