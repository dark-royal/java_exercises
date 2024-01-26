public class Dangling1{

public static void main(String[] args){

int x = 0;
int y = 0;

if(x < 10){
	if(y > 0)
		System.out.println("*****");
}

else{
	System.out.println("#####");
	System.out.println("$$$$$");
}


}


}