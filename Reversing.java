import java.util.Scanner;


public class Reversing{


public static void reversePrint(int[] array){


for( int count = array.length - 1; count >= 0; count--){


	System.out.print(array[count] + "  ");

}

System.out.println();

}


public static void main(String[] args){


int[] array = {1, 2, 3, 4, 5};



reversePrint(array);

}








}