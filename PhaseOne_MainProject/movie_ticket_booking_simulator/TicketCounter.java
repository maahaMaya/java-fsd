package movie_ticket_booking_simulator;
import java.util.*;

public class TicketCounter implements I_TicketCounter{

	Scanner sc = new Scanner(System.in);
	
	FrontDeskCredentials frontDeskCredentials = new FrontDeskCredentials();
	MovieHall movieHall = new MovieHall();
	
	@Override
	public boolean frontDeskLogin() {
		//input by Frontdesk employee
		System.out.println("Enter the FrontDesk id : ");
		String inputId = sc.next();
		System.out.println("Enter the FrontDesk password : ");
		String inputPassword = sc.next();
		
		//check credentails
		if(inputId.equals(frontDeskCredentials.personOneId) && inputPassword.equals(frontDeskCredentials.personOnePassword)) {
			System.out.println("+ --------------------------------- +");
			System.out.print("      ");
			System.out.print("Welcome " + frontDeskCredentials.personOneId + "          ");
			System.out.println("     ");
			System.out.println("+ ----------------------------------+");
			return true;
		}
		else if(inputId.equals(frontDeskCredentials.personTwoId) && inputPassword.equals(frontDeskCredentials.personTwoPassword)) {
			System.out.println("+ --------------------------------- +");
			System.out.print("      ");
			System.out.print("Welcome " + frontDeskCredentials.personOneId + "          ");
			System.out.println("     ");
			System.out.println("+ ----------------------------------+");
			return true;
		}
		else {
			System.out.println("------------------------------------------------------");
			System.out.println("          Please enter the correct credentails        ");
			System.out.println("------------------------------------------------------");
		}
		return false;
	}

	@Override
	public void frontDeskPasswordChange() {
		//input by Frontdesk employee
		System.out.println("Enter the FrontDesk id : ");
		String inputId = sc.next();
		
		System.out.println("Enter the FrontDesk old password : ");
		String inputOldPassword = sc.next();
		
		//change password logic
		if(inputId.equals(frontDeskCredentials.personOneId)) {
			frontDeskCredentials.setPersonOnePassword(inputOldPassword);
			System.out.println("------------------------------------------------------");
			System.out.println("                PASSWORD CHANGED                      ");
			System.out.println("------------------------------------------------------");
		}
		else if(inputId.equals(frontDeskCredentials.personTwoId)) {
			frontDeskCredentials.setPersonTwoPassword(inputOldPassword);
			System.out.println("------------------------------------------------------");
			System.out.println("                 PASSWORD CHANGED                     ");
			System.out.println("------------------------------------------------------");
		}	
	}

	@Override
	public void bookTicket() {
		System.out.println("------------------------------------------------------");
		System.out.println("               WELCOME TO CUSTOMER                    ");
		System.out.println("Ticket price is : " + movieHall.getPerTicketPrice());
		System.out.println("Enter the Total ticket : ");
		int totalTicketBuy = sc.nextInt();
		
		
		if(totalTicketBuy > movieHall.getTotalShowSheat()) {
			System.out.println("Seat is not avilable");
			System.out.println("VISIT AGAIN....");
			return;
		}
		int totalPrice = movieHall.getPerTicketPrice() * totalTicketBuy;
		System.out.println("Total ticket Price : " + totalPrice);
		System.out.print("Check total money is revcived : 1.yes 2.no");
		int moneyRecived = sc.nextInt();
		if(moneyRecived == 1) {
			movieHall.setTotalIncome(totalPrice);
			movieHall.setTotalShowSheat(totalTicketBuy);
			System.out.println("BOOKED TICKET");
		}
		else {
			System.out.println("Please Deposite Money");
		}
		
		System.out.println("VISIT AGAIN");
		System.out.println("------------------------------------------------------");
	}

	@Override
	public void showTicketQuanuityProfit() {
		System.out.println("------------------------------------------------------");
		System.out.println("Total ticket avilable : " +movieHall.getTotalShowSheat());
		System.out.println("Total Sell : " + movieHall.getTotalIncome());
		System.out.println("Price per ticket : " + movieHall.getPerTicketPrice());	
		System.out.println("------------------------------------------------------");
	}
}
