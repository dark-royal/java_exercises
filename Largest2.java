import java.util.Scanner;

public class Largest2{

public static void main(String[] args){

int[] array = {45, 32, 89, 97, 36};

int largest = array[0];

for(int count = 0; count < array.length; count++){
	if(array[count] > largest) largest = array[count];

}

System.out.printf("The largest is %d", largest);


}




}