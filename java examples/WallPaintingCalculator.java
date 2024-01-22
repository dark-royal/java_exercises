import java.util.Scanner;

public class WallPaintingCalculator{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

int eachDoor = 20;

int eachWindow = 15;

int squareFeetPerGallon = 350;

System.out.println("Enter length: ");
double length = scanner.nextDouble();

System.out.println("Enter width: ");
double width = scanner.nextDouble();


System.out.println("Enter height: ");
double height = scanner.nextDouble();

System.out.println("Enter number of doors: ");
int doors = scanner.nextInt();

System.out.println("Enter number of windows: ");
int windows = scanner.nextInt();

double totalSurfaceArea= 2 * (length * width + length * height + width * height);

double areaOfFloor = length * width;


int areaOfDoors = doors * eachDoor;

int areaOfWindows = windows * eachWindow;

double totalPaintArea = (totalSurfaceArea  - areaOfDoors - areaOfWindows - areaOfFloor); 

double requirdPaint = totalPaintArea / 350;


System.out.println("The amount of paint needed is " + requirdPaint + "gallon");

}


}