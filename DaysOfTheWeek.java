import java.util.Scanner;

public class DaysOfTheWeek{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter a year");
int year = input.nextInt();

System.out.println("Enter the month:1-12");
int month = input.nextInt();

System.out.println("Enter day of the month: 1-31");
int day = input.nextInt();


int j = year/100;

int k = year % 100;


int result = ((day + (26 *(month + 1)) / 10) + k + ( k / 4 ) + (j / 4 ) + ( 5 * j)) % 7;


String date =null;

if(result== 0)
date = "saturday";

if(result == 1)
date = "sunday";

if(result == 2)
date = "monday";

if(result == 3)
date = "tuesday";

if(result == 4)
date = "wednesday";

if(result == 5)
date = "thursday"; 

if(result == 6)
date = "friday";

System.out.printf("the day of the week is %s", date); 










 











}












}