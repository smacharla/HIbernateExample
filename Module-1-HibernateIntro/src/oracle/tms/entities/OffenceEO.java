package oracle.tms.entities;
import javax.persistence.*;

@Entity
@Table(name = "TM_OFFENCE")
@NamedQueries({@NamedQuery(name="Offence.findAll",query = "SELECT o FROM OffenceEO o"),
	@NamedQuery(name="Offence.findByPenalty",query = "SELECT o FROM OffenceEO o where o.penalty >= :userGivenPenalty")})

public class OffenceEO {
	
	@Id
	@Column(name="OFFENCE_ID")
	private Integer offenceId;
	@Column(name="OFFENCE_TYPE")
	private String offenceType;
	@Column(name="PENALTY")
	private Float penalty;
	@Column(name="VEH_TYPE")
	private String vehicleType;
	
	public OffenceEO() {
		
	}

	public OffenceEO(Integer offenceId, String offenceType, Float penalty, String vehicleType) {
		super();
		this.offenceId = offenceId;
		this.offenceType = offenceType;
		this.penalty = penalty;
		this.vehicleType = vehicleType;
	}

	public Integer getOffenceId() {
		return offenceId;
	}

	public void setOffenceId(Integer offenceId) {
		this.offenceId = offenceId;
	}

	public String getOffenceType() {
		return offenceType;
	}

	public void setOffenceType(String offenceType) {
		this.offenceType = offenceType;
	}

	public Float getPenalty() {
		return penalty;
	}

	public void setPenalty(Float penalty) {
		this.penalty = penalty;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}
	
	@Override
	public String toString() {
		return "OffenceEO [offenceId=" + offenceId + ", offenceType=" + offenceType + ", penalty=" + penalty
				+ ", vehicleType=" + vehicleType + "]";
	}	
	

}
