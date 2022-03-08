package oracle.tms.dao;

import java.util.List;

import oracle.tms.entities.OffenceEO;

public interface OffenceDAO {
	
	public Integer insertOffence(OffenceEO offenceEORef);
	
	public void updateOffence(OffenceEO offenceEORef);
	
	public void deleteOffence(Integer offenceId);
	
	public OffenceEO findByOffenceId(Integer offenceId);
	
	public List<OffenceEO> findAllOffences();
	
	public List<OffenceEO> findAllOffencesByPenalty(Float givenPenalty);

}