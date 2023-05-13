package camera_rental_app;
import java.util.*;
public class AdminPerformOperations implements AdminOperations {

	//declare variables
	boolean adminLoginSucess = false;
	
	//creating the scanner class object
	Scanner sc = new Scanner(System.in);
	
	@Override
	public boolean adminCredentialsCheck() {
		System.out.println("Enter the Admin id : ");
		String adminId = sc.next();
		System.out.println("Enter the Admin password : ");
		String adminPassword = sc.next();
		CameraRentalAppAdmin cameraRentalAppAdmin = new CameraRentalAppAdmin();
		if(cameraRentalAppAdmin.getAdminId().equals(adminId) && cameraRentalAppAdmin.getAdminPassword().equals(adminPassword)) {
			adminLoginSucess = true;
			return true;
		}
		return false;
	}
	
	
	@Override
	public void adminLogin() {
		do{
			adminCredentialsCheck();
			if(!adminLoginSucess) {
				System.out.println("Enter the Correct credential");
			}
			else if(adminLoginSucess) {
				System.out.println("Login Sucess Admin");
				break;
			}
		}
		while(!adminLoginSucess);
	}
	
}
