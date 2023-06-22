package coms.VaccinationCenterApp.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import coms.VaccinationCenterApp.model.VaccinationCenterDetail;
import coms.VaccinationCenterApp.repository.VaccinationCenteRepo;

@Service
public class VaccinationCenterImpl implements VaccinationCenterService{
	
	@Autowired
	VaccinationCenteRepo vaccinationCenteRepo;

	@Override
	public boolean addNewVaccinationCenter(VaccinationCenterDetail vaccinationCenterDetail) {
		if(vaccinationCenterDetail != null) {
			vaccinationCenteRepo.save(vaccinationCenterDetail);
			return true;
		}
		return false;
	}

	@Override
	public List<VaccinationCenterDetail> findAllVaccinationCenter() {
		List<VaccinationCenterDetail> vaccinationCenterDetailList = vaccinationCenteRepo.findAll();
		return vaccinationCenterDetailList;
	}

	@Override
	public VaccinationCenterDetail findByIdVaccinationCenter(int vcid) {
		Optional<VaccinationCenterDetail> vaccinationCenterOption = vaccinationCenteRepo.findById(vcid); 
		if(vaccinationCenterOption.isPresent())
			return vaccinationCenterOption.get();
		return null;
	}

	@Override
	public boolean updateVaccinationCenter(VaccinationCenterDetail vaccinationCenterDetail) {
		if(vaccinationCenterDetail != null) {
			vaccinationCenteRepo.saveAndFlush(vaccinationCenterDetail);
			return true;
		}
		return false;
	}

	@Override
	public void deleteByIdVaccinationCenter(int vcid) {
		vaccinationCenteRepo.deleteById(vcid);
	}
}
