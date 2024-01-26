public class Account1{

private String name;

private double balance;

public Account1(String name, double balance){

	this.name = name;

	if(balance > 0.0){
		this.balance = balance;

}


}

public void withdraw(double withdrawAmount){
	if(withdrawAmount > 0.0){
		balance = balance - withdrawAmount;

}

}

public double getBalance(){
	return balance;

}

public void setName(String name){
	this.name = name;
}

public String getName(){
	return name;
}



}