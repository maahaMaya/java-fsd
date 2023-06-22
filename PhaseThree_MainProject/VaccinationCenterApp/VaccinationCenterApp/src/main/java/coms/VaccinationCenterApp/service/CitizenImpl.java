package coms.VaccinationCenterApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.VaccinationCenterApp.model.CitizenDetail;
import coms.VaccinationCenterApp.repository.CitizenRepo;

@Service
public class CitizenImpl implements CitizenService{

	@Autowired
	CitizenRepo citizenRepo;
	
	@Override
	public boolean addNewCitizen(CitizenDetail citizenDetail) {
		if(citizenDetail != null) {
			citizenRepo.save(citizenDetail);
			return true;
		}
		return false;
	}

	@Override
	public List<CitizenDetail> findAllCitizen() {
		List<CitizenDetail> citizenList = citizenRepo.findAll();
		return citizenList;
	}

	@Override
	public CitizenDetail findByIdCitizen(int citizenId) {
		Optional<CitizenDetail> citionOptioal = citizenRepo.findById(citizenId);
		if(citionOptioal.isPresent()) {
			return citionOptioal.get();
		}
		return null;
	}

	@Override
	public boolean deleteCitizenById(int citizenId) {
		citizenRepo.deleteById(citizenId);
		return false;
	}

	@Override
	public boolean updateCitizen(CitizenDetail citizenDetail) {
		if(citizenDetail != null) {
			citizenRepo.saveAndFlush(citizenDetail);
			return true;
		}
		return false;
	}

}
