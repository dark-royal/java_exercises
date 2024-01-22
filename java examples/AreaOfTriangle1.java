import java.util.Scanner;

public class AreaOfTriangle1{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

double side1;

double side2;

double side3;

System.out.println("Enter side 1: ");
side1 = scanner.nextDouble();

System.out.println("Enter side 2: ");
side2 = scanner.nextDouble();

System.out.println("Enter side 3: ");
side3 = scanner.nextDouble();


double sides = side1 + side2 + side3 / 2;

double sub1 = sides - side1;

double sub2 = sides - side2;

double sub3 = sides - side3;

double multiplyAllSubs = sub1  * sub2 * sub3 ;

double multiplySidesWithMultiplyAllSubs = sides *  multiplyAllSubs;

double squareRoot = Math.sqrt( multiplySidesWithMultiplyAllSubs);

System.out.println("Square root is" + squareRoot);




}

}