package oracle.tms.factory;

import oracle.tms.dao.VehicleDetailsDAO;
import oracle.tms.dao.impl.VehicleDetailsDAOImpl;

public class VehicleDetailsDAOFactory {
	
	private static VehicleDetailsDAO vehicleDetailsDAORef;
	
	static {
		vehicleDetailsDAORef= new VehicleDetailsDAOImpl();
		
	}
	
	public static VehicleDetailsDAO getVehicleDetailsDAORef() {
		
		return vehicleDetailsDAORef;
		
	}

}
