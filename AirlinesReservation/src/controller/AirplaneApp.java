package controller;

import java.util.Scanner;

import serviceImpl.AirlineServiceImpl;

public class AirplaneApp {
	
 public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	AirlineServiceImpl h1=new AirlineServiceImpl();
	System.out.println("=====================================");
	System.out.println("==================Welcome to Indigo Airbus-320 Reservation System================");
	System.out.println("----------------------------------------------------------------------------------");
	
	while(true) {
		System.out.println("====================Menu================");
		System.out.println("1.Airlines Class Details\n2.Available Seats\n3.Choose the Seats\n4.Check Seat availability\n5.Customer Details By ID\n6.Exit");
		System.out.println("----------------------------");
		System.out.println("Enter your option:");
		System.out.println("===================");
		int op=sc.nextInt();
		switch(op) {
		case 1: h1.classinfo(); break;
		case 2: h1.availableTicket(); break;
		case 3: h1.allotSeat(); break;
		case 4: h1.checkSeat(); break;
		case 5: h1.getCustomerById(); break;
		case 6: System.exit(0); break;
		default: System.err.println("Invalid Option...!!!");
		}
//		System.exit(0);
	}
	
}
}
