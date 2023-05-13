package camera_rental_app;

public class CustomerDetail {
	public String custId;
	public String customerName;
	public int customerBalance;
	public String customerPassword;

	public CustomerDetail(String custId, String customerName, int customerBalance, String customerPassword) {
		super();
		this.custId = custId;
		this.customerName = customerName;
		this.customerBalance = customerBalance;
		this.customerPassword = customerPassword;
	}
}
