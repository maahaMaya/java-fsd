package coms.VaccinationCenterApp.service;

import java.util.Iterator;
import java.util.List;
import java.util.Optional;

import org.hibernate.internal.build.AllowSysOut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;

import coms.VaccinationCenterApp.model.AdminDetail;
import coms.VaccinationCenterApp.repository.AdminRepo;

@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AdminRepo adminRepo;
	
	@Override
	public boolean AddNewAdmin(AdminDetail adminDetail) {
		if(adminDetail != null) {
			adminRepo.save(adminDetail);
			return true;
		}
		return false;
	}

	@Override
	public boolean Search(String Email, String Password) {
		List<AdminDetail> allAdminList = adminRepo.findAll();
		for (Iterator iterator = allAdminList.iterator(); iterator.hasNext();) {
			AdminDetail adminDetail = (AdminDetail) iterator.next();
			if(Email.equals(adminDetail.getEmail()) && Password.equals(adminDetail.getPassword())) {
				System.out.println(adminDetail.getEmail() + "+++++++" + adminDetail.getPassword());
				return true;
			}
		}
		return false;
	}
}
