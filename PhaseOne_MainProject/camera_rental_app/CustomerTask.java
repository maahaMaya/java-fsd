package camera_rental_app;

import java.util.Scanner;

public class CustomerTask {
	// declare Varibale
		boolean customerWhileLoop;

		public CustomerTask() {
			this.customerWhileLoop = true;
		}

		Scanner sc = new Scanner(System.in);

		

		public void customerAllTask() {
			while (customerWhileLoop) {
				System.out.println(
						"Enter \n1.Add Camera \n2.Rent Camera \n3.Remove Camera \n3.Get All Camera \n4.Delete Camera \n5.Logout");
				int inputTaskNumber = sc.nextInt();
				switch (inputTaskNumber) {
				case 1:
					
					break;
				case 2:

					break;
				case 3:

					break;
				case 4:

					break;
				case 5:

					customerWhileLoop = false;
					break;
				default:
					System.out.print("Enter the correct option....");
				}
			}
		}
}
