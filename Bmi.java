import java.util.Scanner ;

public class Bmi {
public static void main(String[] args) {

Scanner scanner = new Scanner(System.in) ;

System.out.println("Enter one pound to kilogram") ;
Double onePoundToKilogram = scanner.nextDouble() ;

System.out.println("Enter weight in pounds") ;
double weightInPound = scanner.nextDouble() ;

double weightInKilogram=weightInPound * 0.45359237;


System.out.println("Enter height in inches to meter") ;
double heightInInchesToMeter = scanner.nextDouble() ;

System.out.println("Enter the height in inches") ;
double heightInInches = scanner.nextDouble() ;

double heightInMeter=heightInInches * 0.0254;

double calculation =  weightInKilogram / (heightInMeter * heightInMeter) ;

System.out.printf("bmi is %.3f" ,calculation ) ;




	}










} 