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

public int age(personAge){
	int currentYear = 0;
	age = currentYear - year;
		return age; 
}

public int maximumHeartRates(maximumHeartRates){
	maximumHeartRates = 220 - age;
		return maximumHeartRates ;
}

public int targetHeartRateRange1(targetHeartRateRange){
	targetHeartRateRange1 = maximumHeartRates * 50/100;
		return targetHeartRateRange1;
}

public int targetHeartRateRange2(targetHeartRateRange){
	targetHeartRateRange2 = maximumHeartRates * 50/100;
		return targetHeartRateRange2;
}

public double weight(weight){
	return weight;
}

public double height(height){
	return height;
}

public double bmi(bmi){
	bmi = weight / height * height;
		return bmi;
}
	
	




}