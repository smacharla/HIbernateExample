package oracle.tms.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;

import oracle.tms.dao.VehicleDetailsDAO;
import oracle.tms.entities.OffenceEO;
import oracle.tms.entities.VehicleDetailsEO;
import oracle.tms.util.HibernateUtil;

public class VehicleDetailsDAOImpl implements VehicleDetailsDAO{

	@Override
	public Integer insertVehicleDetails(VehicleDetailsEO vehicleEORef) {
		
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		sessionRef.beginTransaction();
		Integer intRef=(Integer) sessionRef.save(vehicleEORef);
		sessionRef.getTransaction().commit();
	
		return intRef;
	}

	@Override
	public void updateVehicleDetails(VehicleDetailsEO vehicleEORef) {
		// TODO Auto-generated method stub
		
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		sessionRef.beginTransaction();
		sessionRef.update(vehicleEORef);
		sessionRef.getTransaction().commit();
		
		
	}

	@Override
	public void deleteVehicleDetails(Integer vehicleId) {
		// TODO Auto-generated method stub
		
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		sessionRef.beginTransaction();
		VehicleDetailsEO VehicleDetailsEORefToBeDeleted=sessionRef.get(VehicleDetailsEO.class, vehicleId);
		sessionRef.delete(VehicleDetailsEORefToBeDeleted);
		sessionRef.getTransaction().commit();
		
	}

	@Override
	public VehicleDetailsEO findByVehicleDetailsId(Integer vehicleId) {
		// TODO Auto-generated method stub
		
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		VehicleDetailsEO returnedVehicleEoRef=sessionRef.get(VehicleDetailsEO.class, vehicleId);
		
		return returnedVehicleEoRef;
	}

	@Override
	public List<OffenceEO> findAllVehicleDetails() {
		// TODO Auto-generated method stub
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		Query queryRef=sessionRef.getNamedQuery("VehicleDetails.findAll");
		List<OffenceEO> resultList=queryRef.list();
		return resultList;
		
		
	}

	@Override
	public List<OffenceEO> findAllVehicleDetailssByEngineNo(Float vehicleId) {
		// TODO Auto-generated method stub
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		Query queryRef=sessionRef.getNamedQuery("VehicleDetails.findByEngineNo");
		queryRef.setParameter("userGivenEngineNo", vehicleId);
		List<OffenceEO> resultList=queryRef.list();
		return resultList;
	}

}
