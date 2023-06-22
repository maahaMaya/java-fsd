package coms.VaccinationCenterApp.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import coms.VaccinationCenterApp.model.CitizenDetail;
import coms.VaccinationCenterApp.model.VaccinationCenterDetail;
import coms.VaccinationCenterApp.service.CitizenService;
import coms.VaccinationCenterApp.service.VaccinationCenterService;

@Controller
public class CitizenController {
	@Autowired
	CitizenService citizenService;

	@Autowired
	VaccinationCenterService vaccinationCenterService;

	@GetMapping(value = "/sa")
	public String addNewC() {
		return "AddNewCitizen";
	}
	
	@GetMapping(value = "/addNewCitizen")
	public String AddNewCitizen(@RequestParam("citizenName") String citizenName,
			@RequestParam("citizenCity") String citizenCity, @RequestParam("citizenClinic") String citizenVc,
			@RequestParam("VaccinationDose") int dose, @RequestParam("status") String status) {
		CitizenDetail citizenDetail = new CitizenDetail();
		citizenDetail.setCtizenname(citizenName);
		citizenDetail.setCtizecity(citizenCity);
		citizenDetail.setCtizencliniccity(citizenVc);
		citizenDetail.setNumberofdose(dose);
		citizenDetail.setStatus(status);
		citizenService.addNewCitizen(citizenDetail);
		return "AddNewCitizen";
	}
	
	@GetMapping(value = "/viewAllC")
	public String viewALlCitizen(Model model) {
		List<CitizenDetail> listC = citizenService.findAllCitizen();
		model.addAttribute("lC", listC);
		return "DisplayAllCitizen";
	}
	
	@GetMapping(value = "/deleteCitizen")
	public String DeleteCitizenById(@RequestParam("CitizenId") int cid) {
		citizenService.deleteCitizenById(cid);
		return "redirect:/viewAllC";
	}
	
	@GetMapping(value = "/viewCitizen")
	public String ViewCitizenById(@RequestParam("CitizenId") int cid, Model model) {
		CitizenDetail cD =  citizenService.findByIdCitizen(cid);
		model.addAttribute("cD", cD);
		return "ViewCitizen";
	}
}
