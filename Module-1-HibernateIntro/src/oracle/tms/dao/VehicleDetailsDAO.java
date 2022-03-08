package oracle.tms.dao;

import java.util.List;

import oracle.tms.entities.OffenceEO;
import oracle.tms.entities.VehicleDetailsEO;

public interface VehicleDetailsDAO {
	
	public Integer insertVehicleDetails(VehicleDetailsEO vehicleEORef);
	
	public void updateVehicleDetails(VehicleDetailsEO vehicleEORef);
	
	public void deleteVehicleDetails(Integer vehicleId);
	
	public VehicleDetailsEO findByVehicleDetailsId(Integer vehicleId);
	
	public List<OffenceEO> findAllVehicleDetails();
	
	public List<OffenceEO> findAllVehicleDetailssByEngineNo(Float vehicleId);

}
