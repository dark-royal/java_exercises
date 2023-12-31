import java.util.Scanner;
 
public class HeartProfileTest{
public static void main(String[] args){

Scanner scanner = new Scanner(System. in);

HeartProfile heartProfile = new HeartProfile("Praise","Oyewole", "female", 10,22,2007,50.6,4.6);


System.out.print("Enter the user age");
int age = scanner.nextInt();

int year = 0;
int currentYear = 0;

int personAge = currentYear -  year;

int bmi = weight / height * height;
if(bmi < 18.5)
System.out.print("the bmi value chart is underweight");
 
if(bmi >= 18.5 && bmi <= 24.9)
System.out.print("the bmi value heighty weight");

if(bmi >= 25.0 && bmi <= 29.9)
System.out.print("the bmi value chart is overweight");

if(bmi > 30.0)
System.out.print("the bmi value chart is obesity");

int maximumHeartRates = 220 - age;

int targetHeartRateRange1 = maximumHeartRates * 50/100;

int targetHeartRateRange2 = maximumHeartRates * 85/100;









}




}