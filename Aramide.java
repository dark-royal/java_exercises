public class Aramide{

public static void main(String[] args){

double sum1 = 0.0;


double[] array = {4.5, 6.7, 3.2, 4.1, 6.4, 9.7, 5.5, 7.6, 8.8, 4.4};

double minimum = array[0];

array[6] = 5.5;

double sum = array[0] + array[1];
System.out.printf("The sum is %.2f%n", sum);

for(int i = 0; i < array.length; i++){
	sum1 += array[i];
}

System.out.printf("the sum is %.2f%n", sum1);

for(int i = 0; i < array.length; i++){
	if( array[i] < minimum) minimum = array[i];
}
		

		System.out.printf("The minimum is %.2f%n", minimum);



double yoo = array[5];
	System.out.printf("The index is %.2f", yoo);

double[] array1 = {3.5, 5.5, 4.52, 5.6};
	





}

}