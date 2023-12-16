public class GeoLocator{

	public String findGeopoliticalZone(state){

		return switch(state){
			case "Kano","Kaduna", "Kastina", "Kebbi", "Sokoto","Zamfara"->"North west";

		default-> "No Zone";
		}
	}


}