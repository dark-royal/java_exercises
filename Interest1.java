public class Interest1{

public static void main(String[] args){

double principal = 1000.0;

int year = 2;

double rate = 0.0;

	System.out.printf("%s%20s%n", "rate", "Amount on depsit");


	System.out.println(rate / 10);

	for( rate = 5; rate <= 10; rate++){
	
	double amount = principal * Math.pow(0.1 + rate, year);

	System.out.printf("%s%20s%n", rate, amount);

	
	}




}


}
