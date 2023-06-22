package coms.VaccinationCenterApp.service;

import java.util.List;

import org.springframework.stereotype.Service;

import coms.VaccinationCenterApp.model.VaccinationCenterDetail;

public interface VaccinationCenterService {

	public boolean addNewVaccinationCenter(VaccinationCenterDetail vaccinationCenterDetail);
	
	public List<VaccinationCenterDetail> findAllVaccinationCenter();
	
	public VaccinationCenterDetail findByIdVaccinationCenter(int vcid);
	
	public boolean updateVaccinationCenter(VaccinationCenterDetail vaccinationCenterDetail);
	
	public void deleteByIdVaccinationCenter(int vcid);
	
}
