public class Nut{

public static void main(String[] args){

String name1 = "Alan Turing";
String name2 = "Ada LoveLace";

if(name1.equals(name2)){
	System.out.println("The names are the same");
}

else{
	System.out.println("The names are not the same");

}

int flag = name1.compareTo(name2);

if(flag == 0){
	System.out.println("The names are the same.");
}

else if(flag < 0){
	System.out.println("name1 comes before name2.");
}
else{
	System.out.println("name2 comes from name1.");
}

}

}