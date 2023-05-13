package camera_rental_app;

public interface CustomerOpertaion {
	//register customer by admin only
	public void addCustomerIntoArrayList();
	
	//display all customer
	public void displayCustomer();
	
	//add money in wallet by id
	public void addCustomerBalance(String custId, int rechargeAmount);
	
	//delete customer by id
	public void deleteCustomerById(String custId);
	
	//customer login by id and password
	public CustomerDetail loginCustomer();
	
	//customer add camera
	public boolean addCameraByCustomer();
	
	//display add Camera By Customer
	public void displayAddCameraByCustomer();
	
	//display all camera
	public void displayAllCamera();
	
	//logout Customer
	public void logoutCustomer();
	
	//rent a camera
	public void rentCamera();
	
	//Customer Wallet
	public int customerWallet();
	
	//Customer Rent Details
	public void customerRentDetails();
}
