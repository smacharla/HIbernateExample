package oracle.tms.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "TM_VEHICLEDETAILS")
@NamedQueries({@NamedQuery(name="VehicleDetails.findAll",query = "SELECT o FROM VehicleDetailsEO o"),
	@NamedQuery(name="VehicleDetails.findByEngineNo",query = "SELECT o FROM VehicleDetailsEO o where o.enginerNo = :userGivenEngineNo")})


public class VehicleDetailsEO {
	
	@Id
	@Column(name="VEH_ID")
	private Integer vehicleId;
	
	@Column(name="VEH_TYPE")
	private String vehicleType;
	
	@Column(name="ENGINE_NO")
	private String enginerNo;
	
	@Column(name="MODEL_NO")
	private String modelNo;
	
	@Column(name="VEH_NAME")
	private String vehicleName;
	

	@Column(name="VEH_COLOR")
	private String vehicleColor;
	

	@Column(name="MANUFACTURER_NAME")
	private String manufacturerName;
	
	public VehicleDetailsEO() {
		// TODO Auto-generated constructor stub
	}
	
	@Column(name="DATE_OF_MANUFACTURE")
	private Date manufactureDate;
	
	public VehicleDetailsEO(Integer vehicleId, String vehicleType, String enginerNo, String modelNo, String vehicleName,
			String vehicleColor, String manufacturerName, Date manufactureDate, Integer noOfCylinders,
			Integer cubicCapacity, String fuelUsed) {
		super();
		this.vehicleId = vehicleId;
		this.vehicleType = vehicleType;
		this.enginerNo = enginerNo;
		this.modelNo = modelNo;
		this.vehicleName = vehicleName;
		this.vehicleColor = vehicleColor;
		this.manufacturerName = manufacturerName;
		this.manufactureDate = manufactureDate;
		this.noOfCylinders = noOfCylinders;
		this.cubicCapacity = cubicCapacity;
		this.fuelUsed = fuelUsed;
	}

	@Override
	public String toString() {
		return "VehicleDetailsEO [vehicleId=" + vehicleId + ", vehicleType=" + vehicleType + ", enginerNo=" + enginerNo
				+ ", modelNo=" + modelNo + ", vehicleName=" + vehicleName + ", vehicleColor=" + vehicleColor
				+ ", manufacturerName=" + manufacturerName + ", manufactureDate=" + manufactureDate + ", noOfCylinders="
				+ noOfCylinders + ", cubicCapacity=" + cubicCapacity + ", fuelUsed=" + fuelUsed + "]";
	}

	public Integer getVehicleId() {
		return vehicleId;
	}

	public void setVehicleId(Integer vehicleId) {
		this.vehicleId = vehicleId;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}

	public String getEnginerNo() {
		return enginerNo;
	}

	public void setEnginerNo(String enginerNo) {
		this.enginerNo = enginerNo;
	}

	public String getModelNo() {
		return modelNo;
	}

	public void setModelNo(String modelNo) {
		this.modelNo = modelNo;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}

	public String getVehicleColor() {
		return vehicleColor;
	}

	public void setVehicleColor(String vehicleColor) {
		this.vehicleColor = vehicleColor;
	}

	public String getManufacturerName() {
		return manufacturerName;
	}

	public void setManufacturerName(String manufacturerName) {
		this.manufacturerName = manufacturerName;
	}

	public Date getManufactureDate() {
		return manufactureDate;
	}

	public void setManufactureDate(Date manufactureDate) {
		this.manufactureDate = manufactureDate;
	}

	public Integer getNoOfCylinders() {
		return noOfCylinders;
	}

	public void setNoOfCylinders(Integer noOfCylinders) {
		this.noOfCylinders = noOfCylinders;
	}

	public Integer getCubicCapacity() {
		return cubicCapacity;
	}

	public void setCubicCapacity(Integer cubicCapacity) {
		this.cubicCapacity = cubicCapacity;
	}

	public String getFuelUsed() {
		return fuelUsed;
	}

	public void setFuelUsed(String fuelUsed) {
		this.fuelUsed = fuelUsed;
	}

	@Column(name="NO_OF_CYLINDERS")
	private Integer noOfCylinders;
	
	@Column(name="CUBIC_CAPACITY")
	private Integer cubicCapacity;
	
	@Column(name="FUEL_USED")
	private String fuelUsed;
	
	
	

}
