package camera_rental_app;

import java.util.*;

public class AdminPerformOperations implements AdminOperations {

	// declare variables
	boolean adminLoginSuccess;

	// creating the scanner class object
	Scanner sc = new Scanner(System.in);

	// CustomerPerformOpertaion
	CustomerPerformOpertaion customerPerformOpertaion = new CustomerPerformOpertaion();

	@Override
	public void adminCredentialsCheck() {
		System.out.println("Enter the Admin id : ");
		String adminId = sc.next();
		System.out.println("Enter the Admin password : ");
		String adminPassword = sc.next();
		CameraRentalAppAdmin cameraRentalAppAdmin = new CameraRentalAppAdmin();
		if (cameraRentalAppAdmin.getAdminId().equals(adminId)
				&& cameraRentalAppAdmin.getAdminPassword().equals(adminPassword)) {
			adminLoginSuccess = true;
			return ;
		}
	}

	@Override
	public void adminLogin() {
		do {
			adminCredentialsCheck();
			if (!adminLoginSuccess) {
				System.out.println("Enter the Correct credential");
			} else if (adminLoginSuccess) {
				System.out.println("Login successfully Admin");
				break;
			}
		} while (!adminLoginSuccess);
	}

	@Override
	public void adminRegisterCustomer() {
		customerPerformOpertaion.addCustomerIntoArrayList();
	}

	@Override
	public void adminGetCustomer() {
		// if (adminLoginSuccess) { customerPerformOpertaion.displayCustomer(); }
		 customerPerformOpertaion.displayCustomer();
	}

	@Override
	public void adminRechargeCustomer(String custId, int rechargeAmount) {
		customerPerformOpertaion.addCustomerBalance(custId, rechargeAmount);
	}

	@Override
	public void adminDelteCustomer(String custId) {
		customerPerformOpertaion.deleteCustomerById(custId);
	}
	
	@Override
	public void adminLogout() {
		adminLoginSuccess = false;
		System.out.println("Logout successfully Admin");
	}


}
