package coms.VaccinationCenterApp.service;

import java.util.List;

import coms.VaccinationCenterApp.model.CitizenDetail;

public interface CitizenService {

	public boolean addNewCitizen(CitizenDetail citizenDetail);
	
	public List<CitizenDetail> findAllCitizen();
	
	public CitizenDetail findByIdCitizen(int citizenId);
	
	public boolean deleteCitizenById(int citizenId);
	
	public boolean updateCitizen(CitizenDetail citizenDetail);
}
