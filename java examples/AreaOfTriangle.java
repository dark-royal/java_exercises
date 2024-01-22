import java.util.Scanner;

public class AreaOfTriangle{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.print("Enter radius: ");
int radius = scanner.nextInt();

double area;

double circumference;

area =(Math.PI * radius * radius);

circumference =(2 * Math.PI * radius);

System.out.println("Circumference is" + circumference);
System.out.println("Area is " + area);


}


}