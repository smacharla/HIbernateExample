package oracle.tms.dao.impl;

import java.util.List;

import org.hibernate.query.Query;
import org.hibernate.Session;

import oracle.tms.dao.OffenceDAO;
import oracle.tms.entities.OffenceEO;
import oracle.tms.util.HibernateUtil;

public class OffenceDAOImpl implements OffenceDAO {

	@Override
	public Integer insertOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		
		sessionRef.beginTransaction();
		Integer interef=(Integer)sessionRef.save(offenceEORef);
		sessionRef.getTransaction().commit();
	
		return interef;
	}

	@Override
	public void updateOffence(OffenceEO offenceEORef) {
		// TODO Auto-generated method stub
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		
		sessionRef.beginTransaction();
		sessionRef.update(offenceEORef);
		sessionRef.getTransaction().commit();
	
	}

	@Override
	public void deleteOffence(Integer offenceId) {
Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		
		sessionRef.beginTransaction();
//		sessionRef.delete(offenceEORef);
		OffenceEO offenceEORefToBeDeleted=sessionRef.get(OffenceEO.class, offenceId);
		sessionRef.delete(offenceEORefToBeDeleted);
		sessionRef.getTransaction().commit();

	}

	@Override
	public OffenceEO findByOffenceId(Integer offenceId) {
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();

		OffenceEO returnedOffenceEORef=sessionRef.get(OffenceEO.class, offenceId);
		
		return returnedOffenceEORef;
	}

	@Override
	public List<OffenceEO> findAllOffences() {
		// TODO Auto-generated method stub
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		Query queryRef=sessionRef.getNamedQuery("Offence.findAll");
		List<OffenceEO> resultList=queryRef.list();
		return resultList;
	}

	@Override
	public List<OffenceEO> findAllOffencesByPenalty(Float givenPenalty) {
		// TODO Auto-generated method stub
		Session sessionRef=HibernateUtil.getSessionFactory().openSession();
		Query queryRef=sessionRef.getNamedQuery("Offence.findByPenalty");
		queryRef.setParameter("userGivenPenalty", givenPenalty);
		List<OffenceEO> resultList=queryRef.list();
		return resultList;
	}

}
