public class Oddi{

public static void main(String[] args){

int sum = 0;

for(int i = 1; i < 99; i++){
	if(i % 2 != 0){
		sum += i;
	System.out.printf("%d%n", i);
}
	
}

System.out.printf("the sum of  odd integers between 1 and 99 is%d%n", sum);


}


}