import java.util.Scanner;
public class HeartRatesTest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

HeartRates heartRates = new HeartRates("Praise", "Oyewole", 12,22,2007);

System.out.print("Enter user age");
int age = scanner.nextInt();

int year;
int age = LocalDate.now().getYear() - year;

int maximumHeartRates = 220 - age;

int targetHeartRatesRange1 =  maximumHeartRates  * 50/100;

int targetHeartRatesRange2 =  maximumHeartRates  * 85/100;


System.out.printf("the maximum Heart Rates is %d%n", maximumHeartRates);

System.out.printf("the target Heart Rates Range1 is %d%n", targetHeartRatesRange1);

System.out.printf("the target Heart Rates Range2 is %d", targetHeartRatesRange2);







}




}