public class PetrolPurchase1{

private  String stationLocation;
private String typeOfPetrol;
private int quantity;
private double pricePerLiter;
private double percentageDiscount;

public  void petrolPurchase1(String stationLocation, String typeOfPetrol,int quantity,double pricePerLiter,double percentageDiscount){
	this.stationLocation = stationLocation;
	this. typeOfPetrol = typeOfPetrol;
	this.quantity = quantity;
	this. pricePerLiter = pricePerLiter;
	this.percentageDiscount = percentageDiscount;

}

public void setStationLocation(String stationLocation){
	this.stationLocation = stationLocation;
}

public String getStationLocation(){
	return stationLocation;
}

public void setTypeOfPetrol(String typeOfPetrol){
	this.typeOfPetrol = typeOfPetrol;
}

public String getTypeOfPetrol(){
	return typeOfPetrol;
}

public void setQuantity(int quantity){
	this.quantity = quantity;
}

public int getQuantity(){
	return quantity;
}

public void setPricePerLiter(double pricePerLiter){
	this.pricePerLiter = pricePerLiter;
}

public double getPricePerLiter(){
	return pricePerLiter;
}

public void setPercentageDiscount(double percentageDiscount){
	this.percentageDiscount = percentageDiscount;
}


public double getPercentageDiscount(){
		return percentageDiscount;
}

public double discount(){
	double discount1 = (percentageDiscount / 100) * pricePerLiter;
		return discount1;
}

public double netPurchaseAmount(){
	double netPurchaseAmount1 = (quantity * pricePerLiter) - discount();
		return netPurchaseAmount1;
}













}