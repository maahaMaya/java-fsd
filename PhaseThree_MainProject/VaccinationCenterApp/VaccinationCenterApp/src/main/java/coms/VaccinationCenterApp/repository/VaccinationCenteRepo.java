package coms.VaccinationCenterApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.VaccinationCenterApp.model.VaccinationCenterDetail;

@Repository
public interface VaccinationCenteRepo extends JpaRepository<VaccinationCenterDetail, Integer>{

}
