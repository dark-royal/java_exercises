public class Tabular{

public static void main(String[] args){

int count = 1;

System.out.printf("%5s%5s%5s%5s", "N","N2","N3","N4"); 
 

while(count <= 5){

	

	int N2 = count * count;

	int N3 = N2 * count;
	
	int N4 = N2 * N2;

	System.out.printf("%s%5s%5s%5s%n",count + " ",N2,N3,N4);

	


	count ++;
}



	
  



}



}