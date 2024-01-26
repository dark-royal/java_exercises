 

public class Sum{

public static void main(String[] args){

int[] array = {56, 54, 12, 89, 67,51};

int sum = 0;

for(int count = 0; count < array.length; count++){
	sum += array[count];
}

System.out.printf("The sum is %d", sum);

int count = 0;
while(array[count] <= 6){
	sum += array[count];
}

System.out.println("The sum is " + sum);


do{
	
	sum += array[count];
} while(array[count] != array.length -1 );

	System.out.printf("The sum is %d", sum);
 



}


}