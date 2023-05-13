package camera_rental_app;

import java.util.*;

public class CameraRentalApp {

	public static void main(String[] args) {

		// declare varible
		boolean loginWhileLoop = true;
		// AdminPerformOperations object is called
		AdminPerformOperations adminPerformOperations = new AdminPerformOperations();
		// CustomerPerformOpertaion object is called
		//CustomerPerformOpertaion customerPerformOpertaion = new CustomerPerformOpertaion();

		// Scanner class object is called
		Scanner sc = new Scanner(System.in);

		System.out.println("+ --------------------------------------- +");
		System.out.print("|       ");
		System.out.print("Welcome to Camera Renatal App");
		System.out.println("     |");
		System.out.println("+ --------------------------------------- +");

		while (loginWhileLoop) {
			System.out.println("Enter \n1.Admin Login \n2.Customer Login \n3.Exit");
			int inputToPerformLogin = sc.nextInt();
			switch (inputToPerformLogin) {
			case 1:
				adminPerformOperations.adminLogin();
				// AdminTask object is called
				AdminTask adminTask = new AdminTask();
				if (adminPerformOperations.adminLoginSuccess) {
					adminTask.adminAllTask();
				}
				break;
			case 2:
				break;
			case 3:
				loginWhileLoop = false;
				System.out.print("Exit Successfully");
				sc.close();
				break;
			default:
				System.out.print("Enter the correct options : ");
			}
		}
	}

}
