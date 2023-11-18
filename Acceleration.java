import java.util.Scanner;

public class Acceleration {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in) ;

System.out.println("Enter starting velocity: ") ;
float startingVelocity = scanner.nextFloat() ;

System.out.println("Enter ending velocity: ") ;
float  endingVelocity = scanner.nextFloat() ;

System.out.println("Enter timespan: ") ;
float timeSpan = scanner.nextFloat() ;

float calculation  = endingVelocity -startingVelocity / timeSpan ;

System.out.printf("acceleration is %.3f" ,calculation  ) ;

	}




}













