package camera_rental_app;

public interface AdminOperations {
	// check the admin credentails for login
	public void adminCredentialsCheck();

	// admin login logic
	public void adminLogin();

	//aadmin register Customer
	public void adminRegisterCustomer();
	
	//admin get Customer
	public void adminGetCustomer();
	
	//admin recharege Customer Account balance
	public void adminRechargeCustomer(String custId, int rechargeAmount);
	
	//admin delete customer by id
	public void adminDelteCustomer(String custId);
	// admin logout logic
	public void adminLogout();
	
}
