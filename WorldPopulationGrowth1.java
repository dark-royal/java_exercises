import java.util.Scanner;

public class WorldPopulationGrowth1{

public static void main(String[] args){

int year = 0;



double numericalIncrease = 0.0;

double worldPopulationGrowth = 0.0;

long currentGrowth = 8118835999l;

double growthRate = 0.91 / 100;

System.out.printf("%s%25s%20s%n", "year", "worldPopulationGrowth", "numericalIncrease");

while(year < 75){

	worldPopulationGrowth =  currentGrowth *(1 + growthRate)* year;

	while(numericalIncrease < 75){
		double mul =  currentGrowth * growthRate;
		double add = mul + currentGrowth;
		numericalIncrease = mul + add;
		numericalIncrease++;

	}
	
	year++;
System.out.printf("%s%25s%20s%n", year , worldPopulationGrowth, numericalIncrease);


}


	
	


	

	


	

	

	

}

}