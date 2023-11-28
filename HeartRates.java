public class HeartRates{

private String firstName;
private String lastName;
private int month;
private int day;
private int year;


public HeartRates(String firstName,String lastName,int month,int day,int year){
	this.firstName = firstName;
	this.lastName = lastName;
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


public int age(){
	return 2023 - year;
}

public int maximumHeartRate(){
	return 220 - age();
	
}

public int targetHeartRateRange1(int personTargetHeartRateRange1){
	int targetHeartRateRange1 = maximumHeartRate() * 50/100;
		return targetHeartRateRange1;
}

 public int  targetHeartRateRange2(int personTargetHeartRateRange2){
	int targetHeartRateRange2 = maximumHeartRate() * 85/100;
		return targetHeartRateRange2;
}
 












}