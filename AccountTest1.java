import java.util.Scanner;

public class AccountTest1{

public static  void main(String[] args){

Account1 account1 = new Account1("praise", 59.5);
Account1 account2 = new Account1("aramide", -7.6);

System.out.printf("%s balance: $%.2f%n", account1.getName(), account1.getBalance());
System.out.printf("%s balance: $%.2f%n", account2.getName(), account2.getBalance());

Scanner input = new Scanner(System.in);

System.out.print("Enter withdraw amount for account1: ");
double withdrawAmount = input.nextDouble();

System.out.printf("%nadding %.2f to account1 balnce%n%n", withdrawAmount );

account1.withdraw(withdrawAmount);

System.out.printf("%s balance: $ %n",
account1.getName()); 
 System.out.printf("%s balance: $ %n%n",
 account2.getName());


System.out.print("Enter deposit amount for account2: ");
 withdrawAmount = input.nextDouble();

System.out.printf("%nadding %.2f to account2 balnce%n%n", withdrawAmount );

account2.withdraw(withdrawAmount);

if(withdrawAmount > balance){
	System.out.println("Withdrawal amount exceeded account balance");
}



System.out.printf("%s balance: $ %n",
account2.getName()); 
 System.out.printf("%s balance: $ %n%n",
 account2.getName());





}


}