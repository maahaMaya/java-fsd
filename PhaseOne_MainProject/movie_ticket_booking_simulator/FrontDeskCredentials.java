package movie_ticket_booking_simulator;
import java.util.*;

public class FrontDeskCredentials {
	
	//declare Credentials
	public String personOneId = "hariOm1";
	public String personOnePassword = "hari@12345";
	public String personTwoId = "shivaRaju";
	public String personTwoPassword = "shiv@12345";
	
	//Scanner class object
	Scanner sc = new Scanner(System.in);
	
	//change password Method
	public void setPersonOnePassword(String personOneOldPassword) {
		if(personOneOldPassword.equals(personOnePassword)) {
			System.out.println("Enter the new password : ");
			String newPassword = sc.next();
			this.personOnePassword = newPassword;
		}
	}
	
	public void setPersonTwoPassword(String personTwoOldPassword) {
		if(personTwoOldPassword.equals(personTwoPassword)) {
			System.out.println("Enter the new password : ");
			String newPassword = sc.next();
			this.personTwoPassword = newPassword;
		}
	}
	
	
}
