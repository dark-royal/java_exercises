import java.util.Scanner;

public class Palindrome1{

public static void main(String[] args){

String[] array = {"hannah", "praise", "noon", "isesi"};

int low = 0;

int high = 0;
boolean isPalindrome = true;
while (low < high){
	if(low != high){
		isPalindrome = false;
		break;
}


low++;

high--;
}

if(isPalindrome)
	System.out.println(array + "is a palindrome");

else{
	System.out.println(array + "is not a palindrome");

}

	




}


}