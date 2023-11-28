import java.util.Scanner;
import java.time.LocalDate;
 
public class HealthProfileTest{
public static void main(String[] args){

Scanner scanner = new Scanner(System. in);

HealthProfile healthProfile = new HealthProfile("Praise","Oyewole", "female", 10,22,2007,50.6,4.7);


System.out.print("Enter the user age");
int age = scanner.nextInt();

System.out.print("Enter the weight");
double weight = scanner.nextDouble();

System.out.print("Enter the height");
double height = scanner.nextDouble();

int year;

int personAge = LocalDate.now().getYear() -  year;

double bmi = weight / height * height;
if(bmi < 18.5)
System.out.print("the bmi value chart is underweight");
 
if(bmi >= 18.5 && bmi <= 24.9)
System.out.print("the bmi value heighty weight");

if(bmi >= 25.0 && bmi <= 29.9)
System.out.print("the bmi value chart is overweight");

if(bmi > 30.0)
System.out.print("the bmi value chart is obesity");

int maximumHeartRates = 220 - personAge;

int targetHeartRatesRange1 = maximumHeartRates * 50/100;

int targetHeartRatesRange2 = maximumHeartRates * 85/100;

System.out.printf("The person age is %d%n",personAge);
System.out.printf("The bmi is %d%n", bmi);
System.out.printf("The maximum heart rates is %d%n", maximumHeartRates);
System.out.printf("The target heart rates range1 is %d%n",targetHeartRatesRange1);
System.out.printf("The target heart rates range2 is %d", targetHeartRatesRange2);









}




}