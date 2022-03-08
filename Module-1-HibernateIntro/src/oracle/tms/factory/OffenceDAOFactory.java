package oracle.tms.factory;

import oracle.tms.dao.OffenceDAO;
import oracle.tms.dao.impl.OffenceDAOImpl;

public class OffenceDAOFactory {
	
	private static OffenceDAO offenceDAORef;

	static {
		offenceDAORef = new OffenceDAOImpl();
	}
	
	public static OffenceDAO getOffenceDAORef() {
		
		return offenceDAORef;
	
	}
}
