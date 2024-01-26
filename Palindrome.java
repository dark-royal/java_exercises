import java.util.Scanner;

public class Palindrome{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

String[] array = {"hannaha", "praise", "isesi"};

int low = 0;

int high = array.length() -1;

boolean isPalindrome = true;
while(low < high){
	if(s[low] != s[high]){
		isPalindrome = false;
		break;

}

low++;
high--;
}

return true;


if(isPalindrome)
System.out.println(array.toString y + "is a palindrome");
else{
	System.out.println(array.toString + " is not a palindrome");


}


}

}