package oracle.tms.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.junit.Test;
import org.junit.platform.commons.function.Try;

import junit.framework.Assert;
import oracle.tms.dao.VehicleDetailsDAO;
import oracle.tms.entities.OffenceEO;
import oracle.tms.entities.VehicleDetailsEO;
import oracle.tms.factory.VehicleDetailsDAOFactory;

public class VehicleDetailsDAOTest {
	
	private VehicleDetailsDAO vehicleDetailsDAORef=VehicleDetailsDAOFactory.getVehicleDetailsDAORef();
	
	
	@Test
	public void testInsertVehicle() throws ParseException {
	
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		Date date = format.parse("01-01-2022");
		
		
		VehicleDetailsEO vehicleDetailsEORef= new VehicleDetailsEO(1, "Car", "1234", "XUV","Punch","White","Maruti",date,1,2,"Petrol");
		Integer returnedPK= vehicleDetailsDAORef.insertVehicleDetails(vehicleDetailsEORef);
		Assert.assertEquals(new Integer(1), returnedPK);
		
	}
	
	@Test
	public void testUpdateVehicleDetails() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("dd-MM-yyyy");
		
		Date date = format.parse("01-01-2022");
		
		VehicleDetailsEO vehicleDetailsEORef= new VehicleDetailsEO(1, "Car", "123456", "XUV","Punch","White","Maruti",date,1,2,"Petrol");
		vehicleDetailsDAORef.updateVehicleDetails(vehicleDetailsEORef);
		
	}

}
