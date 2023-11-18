import java.util.Scanner;

public class OnAndOff1{
public static void main(String[] args ){

Scanner input = new Scanner(System.in);

System.out.print("Enter a bit");
int bit = input.nextInt();

if(bit == 0)System.out.println("1");
if(bit == 1)System.out.println("0");


}


}