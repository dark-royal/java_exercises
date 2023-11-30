public class StudentTest{

public static void main(String[] args){

Student account1 = new Student("praise", 87.9);
Student account2 = new Student("aramide", 76.2);

String account1Name = account1.getName();
String account1Grade = account1.getLetterGrade();

String account2Name = account2.getName();
String account2Grade = account2.getLetterGrade();

System.out.printf("%s's letter grade is: %s%n",account1Name,account2Grade);
System.out.printf("%s's letter grade is: %s%n",account2Name,account2Grade);









}



}