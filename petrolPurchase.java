public class PetrolPurchase {

    private String stationsLocation;
    private String typeOfPetrol;
    private int quantity;
    private double pricePerLiter;
    private double percentageDiscount;

    public PetrolPurchase(String stationsLocation, String typeOfPetrol, int quantity, double pricePerLiter, double percentageDiscount) {
        this.stationsLocation = stationsLocation;
        this.typeOfPetrol = typeOfPetrol;
        this.quantity = quantity;
        this.pricePerLiter = pricePerLiter;
        this.percentageDiscount = percentageDiscount;
    }

    public void setStationsLocation(String stationsLocation) {
        this.stationsLocation = stationsLocation;
    }

    public String getStationsLocation() {
        return stationsLocation;
    }

    public void setTypeOfPetrol(String typeOfPetrol) {
        this.typeOfPetrol = typeOfPetrol;
    }

    public String getTypeOfPetrol() {
        return typeOfPetrol;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerLiter(double pricePerLiter) {
        this.pricePerLiter = pricePerLiter;
    }

    public double getPricePerLiter() {
        return pricePerLiter;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

public double discount(double discount){
	discount1 = (percentageDiscount / 100) * pricePerLiter;
	return discount1;
}
public double netPurchaseAmount(double netPurchaseAmount){
	netPurchaseAmount = (quantity * pricePerLiter) - discount1();
	return netPurchaseAmount;
}

   

 
	
       
    }
