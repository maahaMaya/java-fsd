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
	List<RentDetail> listCameraRent = new ArrayList<RentDetail>();

	//
	CustomerDetail afterLoginCustomerDetails;
	RentDetail rentDetails;

	@Override
	public void addCustomerIntoArrayList() {
		/*
		 * if(adminPerformOperations.adminLoginSuccess) {
		 * System.out.print("++++++++++++++++++++"); return; }
		 */
		System.out.println("Enter Customer Name : ");
		String custName = sc.next();

		System.out.println("Enter Money Deposite : ");
		int custMoneyDeposite = sc.nextInt();

		System.out.println("Enter Password : ");
		String customerPassword = sc.next();

		String customerId = custName + custIds;

		listCustomers.add(new CustomerDetail(customerId, custName, custMoneyDeposite, customerPassword));
		custIds++;
		System.out.println("Customer Register Successfully");
	}

	@Override
	public void displayCustomer() {
		System.out.println("-----------------------------------------------------------");
		System.out.println("CustomerId  CustomerName  CustomerBalance  CustomerPassword");
		listCustomers.forEach((listCustomer) -> {
			System.out.println(listCustomer.custId + " 		   " + listCustomer.customerName + "  		  "
					+ listCustomer.customerBalance + " 		   " + listCustomer.customerPassword);
		});
		System.out.println("-----------------------------------------------------------");
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

				System.out.println("+ --------------------------------------- +");
				System.out.print("|       ");
				System.out.print("          Welcome  " + customerDetail.customerName + "       ");
				System.out.println("     |");
				System.out.println("+ --------------------------------------- +");

				System.out.println("Welcome ");
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
			cameraId++;
		} else {
			System.out.print("Please Login!!!");
		}
		return true;
	}

	@Override
	public void displayAddCameraByCustomer() {
		if (afterLoginCustomerDetails != null) {
			System.out.println("========================================================================");
			System.out.println("CameraId	Brand	Model	Qunatity	PricePerDay	Stock");
			for (CameraDetail cameraDetail : listCameras) {
				if (cameraDetail.customerId.equals(afterLoginCustomerDetails.custId)) {
					String cameraAvilabe;
					if (cameraDetail.cameraQunatity > 0) {
						cameraAvilabe = "Avilabe";
					} else {
						cameraAvilabe = "Rented All";
					}
					System.out.println(cameraDetail.cameraId + "             " + cameraDetail.cameraBrand
							+ "             " + cameraDetail.cameraModel + "             " + cameraDetail.cameraQunatity
							+ "             " + cameraDetail.cameraPricePerDay + "             " + cameraAvilabe);
				}
			}
			System.out.println("========================================================================");
		} else {
			System.out.print("Please Login!!!");
		}

	}

	@Override
	public void displayAllCamera() {
		if (afterLoginCustomerDetails != null) {
			System.out.println("==============================================================");
			System.out.println("CameraId	Brand	Model	Qunatity	PricePerDay		Stock");
			for (CameraDetail cameraDetail : listCameras) {
				String cameraAvilabe;
				if (cameraDetail.cameraQunatity > 0) {
					cameraAvilabe = "Avilabe";
				} else {
					cameraAvilabe = "Rented All";
				}
				System.out.println(cameraDetail.cameraId + "    " + cameraDetail.cameraBrand + "    "
						+ cameraDetail.cameraModel + "    " + cameraDetail.cameraQunatity + "    "
						+ cameraDetail.cameraPricePerDay + "    " + cameraAvilabe);
			}
			System.out.println("==============================================================");
		} else {
			System.out.print("Please Login!!!");
		}
	}

	@Override
	public void logoutCustomer() {
		afterLoginCustomerDetails = null;
		System.out.println("+ --------------------------------------- +");
		System.out.print("|       ");
		System.out.print("          Visit Again...                    ");
		System.out.println("     |");
		System.out.println("+ --------------------------------------- +");
	}

	@Override
	public void rentCamera() {
		displayAllCamera();
		if (afterLoginCustomerDetails != null) {
			System.out.println("Enter the Camera Id ");
			int cameraId = sc.nextInt();
			for (CameraDetail cameraDetail : listCameras) {
				if (((int) cameraDetail.cameraId) == (cameraId)) {
					System.out.println("Enter the Camera Qunatity ");
					int cameraQunatity = sc.nextInt();
					if ((int) cameraDetail.cameraQunatity >= cameraQunatity) {
						int totalPrice = cameraDetail.cameraPricePerDay * cameraDetail.cameraQunatity;
						if (afterLoginCustomerDetails.customerBalance >= totalPrice) {

							for (CustomerDetail customerDetail : listCustomers) {
								// buy
								if (customerDetail.custId.equals(afterLoginCustomerDetails.custId)) {
									customerDetail.customerBalance = customerDetail.customerBalance - totalPrice;
									listCustomers.set(listCustomers.indexOf(customerDetail), customerDetail);
								}

								// sell
								if (customerDetail.custId.equals(cameraDetail.customerId)) {
									customerDetail.customerBalance = customerDetail.customerBalance + totalPrice;
									listCustomers.set(listCustomers.indexOf(customerDetail), customerDetail);
								}

								listCameraRent.add(new RentDetail(cameraId, afterLoginCustomerDetails.custId,
										cameraQunatity, cameraDetail.cameraPricePerDay));

								System.out.println("ORDER PLACE SUCCESS");
								return;
							}

						} else {
							int rechargeAmount = totalPrice - afterLoginCustomerDetails.customerBalance;
							System.out.println("recahrge account : " + rechargeAmount + "Rs");
						}
					} else {
						System.out.println("total  product avilabe : " + cameraDetail.cameraQunatity);
					}

				}
			}
		} else {
			System.out.print("Please Login!!!");
		}
	}

	@Override
	public int customerWallet() {
		return afterLoginCustomerDetails.customerBalance;
	}

	@Override
	public void customerRentDetails() {
		for (RentDetail rentDetail : listCameraRent) {
			System.out.println(rentDetail.cameraId + "    " + rentDetail.customerId + "    " + rentDetail.cameraQunatity
					+ "    " + rentDetail.cameraPricePerDay + "    "
					+ (rentDetail.cameraPricePerDay * rentDetail.cameraQunatity));
		}
	}
}
