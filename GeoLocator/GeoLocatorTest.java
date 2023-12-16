import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GeoLocatorTest{


	@Test
	public void testFindGeoPoliticalZones(){

		GeoLocator geolocator = new GeoLocator();

		String state = "Kano";
		

		String Zone = geolocator.findGeopoliticalZones(state);

		
		assertEquals("North west",Zone);
	}


}