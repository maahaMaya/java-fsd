package coms.VaccinationCenterApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "CitizenInfo")
public class CitizenDetail {
	@Id
	@GeneratedValue
	private int citizenid;
	
	private String ctizenname;
	private String ctizecity;
	private int numberofdose;
	private String status;
	private String ctizencliniccity;
	public int getCitizenid() {
		return citizenid;
	}
	public void setCitizenid(int citizenid) {
		this.citizenid = citizenid;
	}
	public String getCtizenname() {
		return ctizenname;
	}
	public void setCtizenname(String ctizenname) {
		this.ctizenname = ctizenname;
	}
	public String getCtizecity() {
		return ctizecity;
	}
	public void setCtizecity(String ctizecity) {
		this.ctizecity = ctizecity;
	}
	public int getNumberofdose() {
		return numberofdose;
	}
	public void setNumberofdose(int numberofdose) {
		this.numberofdose = numberofdose;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getCtizencliniccity() {
		return ctizencliniccity;
	}
	public void setCtizencliniccity(String ctizencliniccity) {
		this.ctizencliniccity = ctizencliniccity;
	}
}
