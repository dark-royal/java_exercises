public class ArmStrong{

public static void main(String[] args){

int temp;

int digit1;
int digit2;
int digit3;

int sum;

for(int number = 1; number <= 500; number++){
	temp = number;
	
	digit1 = temp % 10;
	
	temp = temp / 10;

	digit2 = temp % 10;

	temp = temp / 10;

	digit3 = temp % 10;

	
	sum = (digit1 * digit1 * digit1) + (digit2 * digit2 * digit2) + (digit3 * digit3 * digit3);

	if(sum == number){
		System.out.println(number); 
	
	}

}

}


}