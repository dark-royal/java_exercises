import java.util.Scanner;

public class Month{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter an integer");
int number = input.nextInt();

if(number > 1 && number <= 12){ 

if(number == 1) {System.out.print("january");}

if(number == 2) {System.out.print("february");}

if(number == 3) {System.out.print("march");}

if(number == 4) {System.out.print("april");}

if(number == 5) {System.out.print("may");}

if(number == 6) {System.out.print("june");}

if(number == 7) {System.out.print("july");}

if(number == 8) {System.out.print("august");}

if(number == 9) {System.out.print("september");}

if(number == 10) {System.out.print("october");}

if(number == 11) {System.out.print("november");}

if(number == 12) {System.out.print("december");}
}

else {
System.out.print("it is not part of the month");
}




}



}