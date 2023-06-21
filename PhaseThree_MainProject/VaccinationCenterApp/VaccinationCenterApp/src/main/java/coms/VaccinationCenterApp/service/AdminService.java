package coms.VaccinationCenterApp.service;

import org.springframework.ui.Model;

import coms.VaccinationCenterApp.model.AdminDetail;

public interface AdminService {

	public boolean AddNewAdmin(AdminDetail adminDetail);

	public boolean Search(String Email, String Password);
}