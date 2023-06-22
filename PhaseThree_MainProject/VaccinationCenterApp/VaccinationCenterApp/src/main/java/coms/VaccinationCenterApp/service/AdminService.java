package coms.VaccinationCenterApp.service;

import coms.VaccinationCenterApp.model.AdminDetail;

public interface AdminService {

	public boolean AddNewAdmin(AdminDetail adminDetail);

	public boolean Search(String Email, String Password);
}