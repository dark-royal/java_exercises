public class Test2{

public static void main(String[] args){

int list[] = {1, 2, 3, 4, 5, 6};

for(int i = 0; i < list.length; i++){

	list[i] = list[i - 1];

for( i = 0; i < list.length; i++){
	System.out.print(list[i] + " ");

}

}
		

}

}