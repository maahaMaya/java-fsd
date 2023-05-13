package camera_rental_app;

import java.util.*;

public class CameraRentalApp {

	public static void main(String[] args) {

		// declare varible
		boolean loginWhileLoop = true;
		// AdminPerformOperations object is called
		AdminPerformOperations adminPerformOperations = new AdminPerformOperations();
		AdminTask adminTask = new AdminTask();
		// CustomerPerformOpertaion object is called
		// CustomerPerformOpertaion customerPerformOpertaion = new
		// CustomerPerformOpertaion();

		// Scanner class object is called
		Scanner sc = new Scanner(System.in);

		System.out.println("+ --------------------------------------- +");
		System.out.print("|       ");
		System.out.print("Welcome to Camera Renatal App");
		System.out.println("     |");
		System.out.println("+ --------------------------------------- +");

		adminPerformOperations.adminLogin();
		// AdminTask object is called

		if (adminPerformOperations.adminLoginSuccess) {
			adminTask.adminAllTask();
		}
	}

}
