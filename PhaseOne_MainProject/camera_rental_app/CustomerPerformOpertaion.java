package camera_rental_app;
import java.util.*;

public class CustomerPerformOpertaion implements CustomerOpertaion{
	
	int custIds = 1;
	
	Scanner sc = new Scanner(System.in);
	
	//AdminPerformOperations adminPerformOperations = new AdminPerformOperations(); give error
	List<CustomerDetail> listCustomers = new ArrayList<CustomerDetail>();

	@Override
	public void addCustomerIntoArrayList() {
		/*
		 * if(adminPerformOperations.adminLoginSuccess) {
		 * System.out.print("++++++++++++++++++++"); return; }
		 */
		System.out.println("Enter Name : ");
		String  custName = sc.next();
		
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
		for(CustomerDetail customerDetail : listCustomers) {
			if(customerDetail.custId.equals(custId)) {
				customerDetail.customerBalance = (customerDetail.customerBalance + rechargeAmount);
				listCustomers.set(listCustomers.indexOf(customerDetail), customerDetail);
				System.out.println("Balance update successfully for : " + custId);
			}
		}
	}


	@Override
	public void deleteCustomerById(String custId) {
		for(CustomerDetail customerDetail : listCustomers) {
			if(customerDetail.custId.equals(custId)) {
				int deleteIndex = listCustomers.indexOf(customerDetail);
				listCustomers.remove(deleteIndex);
				System.out.println("Delete successfully for : " + custId);
				return;
			}
		}
	}
}
