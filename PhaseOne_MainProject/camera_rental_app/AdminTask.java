package camera_rental_app;

import java.util.*;

public class AdminTask {

	// declare Varibale
	boolean adminWhileLoop;

	public AdminTask() {
		this.adminWhileLoop = true;
	}

	Scanner sc = new Scanner(System.in);

	AdminPerformOperations adminPerformOperations = new AdminPerformOperations();

	public void adminAllTask() {
		while (adminWhileLoop) {
			System.out.println(
					"Enter \n1.Add Customer \n2.Recharge Customer Account \n3.Get All Customer \n4.Delete Customer \n5.Logout Admin \n6.Login Admin "
					+ "\n7.Login Customer \n8. Add Camera By Customer \n9.Display Customer Camera By Id \n10.Logout Customer \n11.Rent a camera \n12. My Wallet");
			int inputTaskNumber = sc.nextInt();
			switch (inputTaskNumber) {
			case 1:
				adminPerformOperations.adminRegisterCustomer();
				break;
			case 2:
				System.out.println("Enter Customer Id : ");
				String custId = sc.next();
				System.out.println("Enter Money Deposite : ");
				int custAddMoney = sc.nextInt();
				adminPerformOperations.adminRechargeCustomer(custId, custAddMoney);
				break;
			case 3:
				adminPerformOperations.adminGetCustomer();
				break;
			case 4:
				System.out.println("Enter Customer Id : ");
				String custIdForDelete = sc.next();
				adminPerformOperations.adminDelteCustomer(custIdForDelete);
				break;
			case 5:
				adminPerformOperations.adminLogout();
				break;
			case 6:
				adminPerformOperations.adminLogin();
				break;
			case 7:
				adminPerformOperations.loginCustomers();
				break;
			case 8:
				adminPerformOperations.addCameraByCustomer();
				break;
			case 9:
				adminPerformOperations.displayCustomersCameraById();
				break;
			case 10:
				adminPerformOperations.logoutCustomer();
				break;
			case 11:
				adminPerformOperations.rentCamera();
				break;
			case 12:
				adminPerformOperations.customerWallet();
				break;
			
			default:
				System.out.print("Enter the correct option....");
			}
		}
	}
}
