import java.util.Scanner;

public class WorldPopulationGrowth{

public  static void  main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the current world population");
long currentWorldPopulation = scanner.nextLong();

System.out.println("Enter annual world population growth rate");
double growthRate = scanner.nextDouble();

System.out.println("Enter year");
int year = scanner.nextInt();

double worldPop = currentWorldPopulation * (1 + growthRate) * year;

System.out.printf("The estimated world population is %f", worldPop);









}


}