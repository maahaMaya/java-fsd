package coms.VaccinationCenterApp.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "vaccinationcenter")
public class VaccinationCenterDetail {
	@Id
	@GeneratedValue
	public int vaccinationcenterid;

	public String centername;
	public String centercity;
	
	public int getVaccinationcenterid() {
		return vaccinationcenterid;
	}
	public void setVaccinationcenterid(int vaccinationcenterid) {
		this.vaccinationcenterid = vaccinationcenterid;
	}
	public String getCentername() {
		return centername;
	}
	public void setCentername(String centername) {
		this.centername = centername;
	}
	public String getCentercity() {
		return centercity;
	}
	public void setCentercity(String centercity) {
		this.centercity = centercity;
	}


}
