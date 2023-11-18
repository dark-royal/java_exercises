import java.util.Scanner;

public class DaysInMonth{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter a month");
int month = input.nextInt();

System.out.print("Enter a year");
int year = input.nextInt();

if(month > 1 && month <= 12){

if(month == 1)
System.out.printf("January %d has 31 days", year);
if (month == 2) {
if(year % 4 == 0)
System.out.printf("february %d has 29 days", year);

else
System.out.printf("february %d has 28 days", year);
}

if(month == 3)
System.out.printf("march %d has 31 days", year);

if(month == 4)
System.out.printf("april %d has 30 days", year);

if(month == 5)
System.out.printf("may %d has 31 days", year);

if(month == 6)
System.out.printf("june %d has 30 days", year);

if(month == 7)
System.out.printf("july %d has 31 days", year);

if(month == 8)
System.out.printf("august %d has 31 days", year);

if(month == 9)
System.out.printf("september %d has 30 days", year);

if(month == 10)
System.out.printf("october %d has 31 days", year);

if(month == 11)
System.out.printf("november %d has 30 days", year);

if(month == 12)
System.out.printf("december %d has 31 days", year);
}
else System.out.print("not a month");
		

    }

}





