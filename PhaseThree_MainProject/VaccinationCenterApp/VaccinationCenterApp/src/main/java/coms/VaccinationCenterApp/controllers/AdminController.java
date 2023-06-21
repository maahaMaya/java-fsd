package coms.VaccinationCenterApp.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import coms.VaccinationCenterApp.model.AdminDetail;
import coms.VaccinationCenterApp.service.AdminService;

@Controller
public class AdminController {

	@Autowired
	AdminService adminService;

	@GetMapping(value = "/")
	public String adminLoginPage() {
		return "AdminLogin";
	}
	
	@PostMapping(value = "/userLogin")
	public String adminLoginMethod(@RequestParam("username") String userName, @RequestParam("password") String password, Model model) {
		if(adminService.Search(userName, password)) {
			System.out.println("HomePage Login Success");
			return "HomePage";
		}
		System.out.println("HomePage Login UnnnSuccess");
		model.addAttribute("incorrectCredentailsMressage", "Please enter Correct username and password");
		return "AdminLogin";
	}

	@GetMapping("/RegisterAdminPage")
	public String adminRegistrationPageLoad() {
		return "AdminRegister";
	}
	@PostMapping(value = "/RegisterAdminPageMethod")
	public String adminRegisterPage(@RequestParam("adminName") String adminName,
			@RequestParam("adminEmail") String adminEmail, @RequestParam("adminPassword") String adminPassword,
			Model model) {
		AdminDetail adminDetail = new AdminDetail();
		adminDetail.setName(adminName);
		adminDetail.setEmail(adminEmail);
		adminDetail.setPassword(adminPassword);

		if (adminService.AddNewAdmin(adminDetail) == true) {
			System.out.println("Admin added successfully...");
		} else {
			System.out.println("Try Again");
		}
		return "AdminLogin";
	}
}