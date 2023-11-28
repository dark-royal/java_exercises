import java.time.LocalDate;

public class HealthProfile{

private String firstName;
private String lastName;
private String gender;
private int month;
private int day;
private int year;

public HealthProfile(String firstName, String lastName,String gender,int month,int day,int year){

	this.firstName = firstName;
	this.lastName = lastName;
	this.gender = gender;
	this.month = month;
	this.day = day;
	this.year = year;

}

public void setFirstName(String firstName){
	this.firstName = firstName;
}

public String getFirstName(){
	return firstName;
}

public void setLastName(String lastName){
	this.lastName = lastName;
}

public String getLastName(){
	return lastName;
}

public void setGender(String gender){
	this.gender = gender;
}

public String getGender(){
	return gender;
}

public void setMonth(int month){
	this.month = month;
}

public int getMonth(){
	return month;
}

public void setDay(int day){
	this.day = day;
}

public int getDay(){
	return day;
}

public void setYear(int year){
	this.year = year;
}

public int getYear(){
	return year;
}

public int personage(){
	return LocalDate.now().getYear() - year;
		//return personAge; 
}

public int maximumHeartRates(){
	int maximumHeartRates = 220 - personage();
		return maximumHeartRates ;
}

public double targetHeartRatesRange1(){
	double targetHeartRatesRange1= maximumHeartRates() * 50/100;
		return targetHeartRatesRange1;
}

public double targetHeartRatesRange2(){
	double targetHeartRatesRange2= maximumHeartRates() * 85/100;
		return targetHeartRatesRange2;
}

public double bmi(double height, double weight){
	double bmi = weight / (height * height);
		return bmi;
}


	
	




}