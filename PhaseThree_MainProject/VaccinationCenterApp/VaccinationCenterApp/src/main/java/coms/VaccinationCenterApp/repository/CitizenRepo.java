package coms.VaccinationCenterApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import coms.VaccinationCenterApp.model.CitizenDetail;

@Repository
public interface CitizenRepo extends JpaRepository<CitizenDetail, Integer>{

}
