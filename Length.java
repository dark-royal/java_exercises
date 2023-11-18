import java.util.Scanner;

public class Length{
public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.print("Enter the value of speed");
int speed = input.nextInt();

System.out.print("Enter the value of acceleration");
double acceleration = input.nextDouble();

int number = speed * speed;

double number2 = 2 * acceleration;

double result = (speed * speed) / number2;

System.out.printf("length is %f%n", result);





	}





}