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
}
