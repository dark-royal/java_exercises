import java.util.Scanner;

public class RightAngledTriangle{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int count = 1;
int length = 0;
int count1 = 1;


System.out.println("Enter base length");
int baseLength = scanner.nextInt();


while(count <= 10){
	System.out.println("*");
	count++;
	while(count1 <= count){
		System.out.print("*");
		count1 ++;
		}
System.out.println();
	}

}


}