import java.util.Scanner;

public class Age{

public static void main(String[] args){


Scanner scanner = new Scanner(System.in);

System.out.println("Enter age");
int age = scanner.nextInt();

if(age >= 65){
	System.out.println("Age is greater than or equal to 65");
}

else{
	System.out.println("Age is less than 65");

}


}




}