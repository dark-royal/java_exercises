import java.util.Scanner;

public class Add{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int sum = 0;


for(int count = 0; count <= 10; count++){
	System.out.println("Enter number: ");
	int n = scanner.nextInt();

	
	sum += 1 + 1 / n;
	
}

System.out.println(sum);

}

}