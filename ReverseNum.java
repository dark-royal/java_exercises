import java.util.Scanner;

public class ReverseNum{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter five digit number: ");
String number = scanner.next();

int numberLength = number.length();

String reverseNum = "";

for(int i = numberLength - 1; i >= 0; i--){
	reverseNum += number.charAt(i);	
}

if(numberLength == 5){	
	System.out.println(reverseNum);
}

else{
	System.out.println("invalid input");
}



	


	

	








}


}