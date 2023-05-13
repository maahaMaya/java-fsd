package camera_rental_app;

import java.util.*;

public class CustomerPerformOpertaion implements CustomerOpertaion {

	int custIds = 1;
	int cameraId = 100;

	Scanner sc = new Scanner(System.in);

	// AdminPerformOperations adminPerformOperations = new AdminPerformOperations();
	// give error
	List<CustomerDetail> listCustomers = new ArrayList<CustomerDetail>();

	//
	List<CameraDetail> listCameras = new ArrayList<CameraDetail>();

	//
	CustomerDetail afterLoginCustomerDetails;

	@Override
	public void addCustomerIntoArrayList() {
		/*
		 * if(adminPerformOperations.adminLoginSuccess) {
		 * System.out.print("++++++++++++++++++++"); return; }
		 */
		System.out.println("Enter Name : ");
		String custName = sc.next();

		System.out.println("Enter Money Deposite : ");
		int custMoneyDeposite = sc.nextInt();

		System.out.println("Enter Password : ");
		String customerPassword = sc.next();

		String customerId = custName + custIds;

		listCustomers.add(new CustomerDetail(customerId, custName, custMoneyDeposite, customerPassword));
		custIds++;
	}

	@Override
	public void displayCustomer() {
		System.out.println("---------------------------------------");
		listCustomers.forEach((listCustomer) -> {
			System.out.println(listCustomer.custId);
			System.out.println(listCustomer.customerName);
			System.out.println(listCustomer.customerBalance);
			System.out.println(listCustomer.customerPassword);
			System.out.println("---------------------------------------");
		});
	}

	@Override
	public void addCustomerBalance(String custId, int rechargeAmount) {
		// TODO Auto-generated method stub
		for (CustomerDetail customerDetail : listCustomers) {
			if (customerDetail.custId.equals(custId)) {
				customerDetail.customerBalance = (customerDetail.customerBalance + rechargeAmount);
				listCustomers.set(listCustomers.indexOf(customerDetail), customerDetail);
				System.out.println("Balance update successfully for : " + custId);
			}
		}
	}

	@Override
	public void deleteCustomerById(String custId) {
		for (CustomerDetail customerDetail : listCustomers) {
			if (customerDetail.custId.equals(custId)) {
				int deleteIndex = listCustomers.indexOf(customerDetail);
				listCustomers.remove(deleteIndex);
				System.out.println("Delete successfully for : " + custId);
				return;
			}
		}
	}

	@Override
	public CustomerDetail loginCustomer() {
		System.out.println("Enter Customer Id : ");
		String custId = sc.next();
		System.out.println("Enter Customer Password : ");
		String custPassword = sc.next();

		for (CustomerDetail customerDetail : listCustomers) {
			if (customerDetail.custId.equals(custId) && customerDetail.customerPassword.equals(custPassword)) {
				System.out.println("Welcome " + customerDetail.customerName);
				afterLoginCustomerDetails = customerDetail;
				return customerDetail;
			}
		}
		return null;
	}

	@Override
	public boolean addCameraByCustomer() {
		if (afterLoginCustomerDetails != null) {
			String customerId = afterLoginCustomerDetails.custId;
			System.out.println("Enter the Camera Brand ");
			String cameraBrand = sc.next();
			System.out.println("Enter the Camera Model ");
			String cameraModel = sc.next();
			System.out.println("Enter the Camera Qunatity ");
			int cameraQunatity = sc.nextInt();
			System.out.println("Enter the Camera Price per day ");
			int cameraPricePerDay = sc.nextInt();
			listCameras.add(new CameraDetail(cameraId, customerId, cameraBrand, cameraModel, cameraQunatity,
					cameraPricePerDay));
		} else {
			System.out.print("Please Login!!!");
		}
		return true;
	}

	@Override
	public void displayAddCameraByCustomer() {
		if (afterLoginCustomerDetails != null) {
			System.out.println("============================================================================");
			System.out.println("CameraId	Brand		Model		Qunatity		PricePerDay		Stock   ");
			for (CameraDetail cameraDetail : listCameras) {
				if (cameraDetail.customerId.equals(afterLoginCustomerDetails.custId)) {
					String cameraAvilabe;
					if (cameraDetail.cameraQunatity > 0) {
						cameraAvilabe = "Avilabe";
					} else {
						cameraAvilabe = "Rented All";
					}
					System.out.println(cameraDetail.cameraId + "  " + cameraDetail.cameraBrand + "  "
							+ cameraDetail.cameraModel + "  " + cameraDetail.cameraQunatity + "  "
							+ cameraDetail.cameraPricePerDay + "  " + cameraAvilabe);
				}
			}
			System.out.println("============================================================================");
		} else {
			System.out.print("Please Login!!!");
		}

	}

	@Override
	public void logoutCustomer() {
		afterLoginCustomerDetails = null;
		System.out.println("Visit Again....");
	}

	@Override
	public void rentCamera() {
		System.out.println("Customer Rent logic");
	}

	@Override
	public int customerWallet() {
		return afterLoginCustomerDetails.customerBalance;
	}
}
