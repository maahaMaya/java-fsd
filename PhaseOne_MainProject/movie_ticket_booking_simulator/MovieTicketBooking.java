package movie_ticket_booking_simulator;

import java.util.*;

public class MovieTicketBooking {

	public static void main(String[] args) {
		System.out.println("+ --------------------------------------- +");
		System.out.print("|    ");
		System.out.print("Welcome to Movie Ticket booking App");
		System.out.println("  |");
		System.out.println("+ --------------------------------------- +");

		//declare class object
		TicketCounter ticketCounter = new TicketCounter();
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("Enter the option ::");
			System.out.println(
					"1. FrontDesk Login \n2. FrontDesk Change Password \n3. FrontDesk Booking Ticket \n4. MovieHall Details \n5. Exit");
			int inputToPerfotmtask = sc.nextInt();
			switch (inputToPerfotmtask) {
			case 1:
				ticketCounter.frontDeskLogin();
				break;
			case 2:
				ticketCounter.frontDeskPasswordChange();
				break;
			case 3:
				ticketCounter.bookTicket();
				break;
			case 4:
				ticketCounter.showTicketQuanuityProfit();
				break;
			case 5:
				return;
			default:
				System.out.println("Enter the correct option....");
			}
		}
	}
}
