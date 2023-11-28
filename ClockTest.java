import java.util.Scanner;
public class ClockTest{

public static void main(String[] args){

Scanner scanner = new Scanner(System.in);

System.out.println("Enter the hour");
int hour = scanner.nextInt();

System.out.println("Enter the minute");
int minute = scanner.nextInt();

System.out.println("Enter the second");
int second = scanner.nextInt();

Clock clock = new Clock(hour,minute,second);

if(hour < 0 || minute < 0 || second <  0 || hour > 23 || minute > 59 || second > 59)

{
System.out.println("invalid");
}
 else
clock.displayTime();

}









}




