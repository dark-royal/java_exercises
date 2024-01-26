import java.util.Calendar;

import java.util.Scanner;

public class Year{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter your age year");
int year = scanner.nextInt();

Calendar calendar = Calendar.getInstance();

int currentYear = calendar.get(Calendar.YEAR);


int age = currentYear - year;

if(year < 0){
	System.out.println("Invalid input");
}

else{

	System.out.printf("You are %d years old", age);

}


}



}