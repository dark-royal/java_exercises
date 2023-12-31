import java.util.Scanner;

public class Total{

public static void main(String[] args){

int[] array = {2, 45, 98, 54};

int total = 0;

for(int count = 0; count < array.length; count++){
	total += array[count];
	
}

System.out.println("The total is " + total);


}


}