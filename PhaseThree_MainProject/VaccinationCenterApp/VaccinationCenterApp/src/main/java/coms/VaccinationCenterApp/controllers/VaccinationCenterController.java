package coms.VaccinationCenterApp.controllers;

import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestParam;

import coms.VaccinationCenterApp.model.VaccinationCenterDetail;
import coms.VaccinationCenterApp.service.VaccinationCenterService;

@Controller
public class VaccinationCenterController {

	@Autowired
	VaccinationCenterService vaccinationCenterService;
	
	@GetMapping(value ="/viewAll")
	public String viewAllVaccinationCenter(Model model) {
		List<VaccinationCenterDetail> vaccinationCenterDetailsList = vaccinationCenterService.findAllVaccinationCenter();
		for (Iterator iterator = vaccinationCenterDetailsList.iterator(); iterator.hasNext();) {
			VaccinationCenterDetail vaccinationCenterDetail = (VaccinationCenterDetail) iterator.next();
			System.out.println(vaccinationCenterDetail.getVaccinationcenterid());
			System.out.println(vaccinationCenterDetail.getCentername());
			System.out.println(vaccinationCenterDetail.getCentercity());
		}
		
		model.addAttribute("listOfVaccinationCenter", vaccinationCenterDetailsList);
		return "DisplayVaccinationCenter";
	}
	
	@GetMapping(value = "/addVc")
	public String add() {
		return "AddNewVaccinationCenter";
	}
	
	@GetMapping(value = "/addNewVc")
	public String addNewVaccinationCenter(@RequestParam("") String centerName, @RequestParam("") String centerCity) {
		VaccinationCenterDetail vaccinationCenterDetail = new VaccinationCenterDetail();
		vaccinationCenterDetail.setCentername(centerName);
		vaccinationCenterDetail.setCentercity(centerCity);
		
		vaccinationCenterService.addNewVaccinationCenter(vaccinationCenterDetail);
		
		return "AddNewVaccinationCenter";
	}
	
	@GetMapping(value = "/deleteVc")
	public String DeleteVaccinationCentreById(@RequestParam("vaccinationCenterId") int vcid) {
		vaccinationCenterService.deleteByIdVaccinationCenter(vcid);
		return "redirect:/viewAll";
	}
	
	@GetMapping(value = "/updateCall")
	public String updateVaccinationCentre(@RequestParam("vaccinationCenterId") int vcid, Model model) {
		VaccinationCenterDetail vaccinationCenterDetail = vaccinationCenterService.findByIdVaccinationCenter(vcid);
		model.addAttribute("crk", vaccinationCenterDetail);
		return "UpdateVaccinationCenter";
	}
	
	@GetMapping(value = "updateMethod")
	public String updateVaccinationCentreMethod(@ModelAttribute("crk") VaccinationCenterDetail updateValueObject, Model model) {
		vaccinationCenterService.updateVaccinationCenter(updateValueObject);
		return "redirect:/viewAll";
	}
}
