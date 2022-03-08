package oracle.tms.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;
import oracle.tms.dao.OffenceDAO;
import oracle.tms.entities.OffenceEO;
import oracle.tms.factory.OffenceDAOFactory;

public class OffenceDAOTest {
	
	private OffenceDAO offenceDAORef= OffenceDAOFactory.getOffenceDAORef();
	
	@Test
	public void testInsertOffence() {
		OffenceEO offenceEORef= new OffenceEO(1003, "Driving Without Licnce", 1001.0F, "All Vehicles");
		Integer returnedPK= offenceDAORef.insertOffence(offenceEORef);
		Assert.assertEquals(new Integer(1003), returnedPK);
	}
	
	@Test
	public void testUpdateOffence() {
		OffenceEO offenceEORef= new OffenceEO(1003, "Driving Without Licnce", 25000.0F, "All Vehicles");
		offenceDAORef.updateOffence(offenceEORef);
//		Assert.assertEquals(new Integer(1003), returnedPK);
	}
	
	@Test
	public void testFindOffenceById() {
		OffenceEO offenceEORef= offenceDAORef.findByOffenceId(1002);
		System.out.println(offenceEORef);
		
//		Assert.assertEquals(new Integer(1003), returnedPK);
	}
	
	@Test
	public void testDeleteOffenceById() {
		offenceDAORef.deleteOffence((1003));
		
		
//		Assert.assertEquals(new Integer(1003), returnedPK);
	}

	@Test
	public void testfindAllOffences() {
		List<OffenceEO> resultOffenceEOList=offenceDAORef.findAllOffences();
		
		for (Iterator iterator = resultOffenceEOList.iterator(); iterator.hasNext();) {
			OffenceEO offenceEO = (OffenceEO) iterator.next();
			System.out.println(offenceEO);
			
		}
		
		
//		Assert.assertEquals(new Integer(1003), returnedPK);
	}
	
	@Test
	public void testfindAllOffencesByPenalty() {
		List<OffenceEO> resultOffenceEOList=offenceDAORef.findAllOffencesByPenalty(1001F);
		
		for (Iterator iterator = resultOffenceEOList.iterator(); iterator.hasNext();) {
			OffenceEO offenceEO = (OffenceEO) iterator.next();
			System.out.println(offenceEO);
			
		}
		
		
//		Assert.assertEquals(new Integer(1003), returnedPK);
	}
	

}
