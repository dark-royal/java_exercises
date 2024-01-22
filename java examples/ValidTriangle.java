import java.util.Scanner;

public  class ValidTriangle{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter three angles");
double angle1 = scanner.nextDouble();

double angle2 = scanner.nextDouble();

double angle3 = scanner.nextDouble();

double sumAngles= angle1 + angle2 + angle3;

if(sumAngles == 180){
	System.out.println("it is valid");

}

else{
	System.out.print("It is invalid");
}


}


}