package serviceImpl;

import java.util.LinkedHashMap;
import java.util.Scanner;
import java.util.Set;

import dao.AirlineRepo;
import entity.Address;
import entity.Customer;
import service.AirlineService;

public class AirlineServiceImpl implements AirlineService, AirlineRepo {
	Scanner sc=new Scanner(System.in);
	{
		//non static block is used here(start)
		//use to create class seats
		for(int i=1; i<=60; i++) {
			ec.put(i, null);
		}
		for(int i=1; i<=30; i++) {
			pec.put(i, null);
		}
		for(int i=1; i<=10; i++) {
			bc.put(i, null);
		}
	}
	
//	non static block end here (stop)
	
	public void classinfo() {
		System.out.println("<<//==================Economy Class=================\\>>");
		System.out.println("Seat capacity: normal");
		System.out.println("Wifi: No");
		System.out.println("Tv: No");
		System.out.println("Food: Not included");
		System.out.println("Drink: Not included");
		System.out.println("Price: 5500");
		
		
		System.out.println("<<//====================Premium Economy Class============\\>>");
		System.out.println("Seat capacity: XL");
		System.out.println("wIFI: No");
		System.out.println("Tv: No");
		System.out.println("Food: Not include");
		System.out.println("Drink: Not included");
		System.out.println("Price: 6500");
		
		System.out.println("<<//===================Business Class======================\\>>");
		System.out.println("Seat capacity: Double XL coupe");
		System.out.println("Wifi: Yes");
		System.out.println("Tv: Yes");
		System.out.println("Food: included");
		System.out.println("Drink: included");
		System.out.println("Price: 8000");
		
		
	}
	public void checkTicket (LinkedHashMap<Integer,Customer>li) {
		boolean f=false;
		for(Integer ele: li.keySet()) {
			if(li.get(ele)==null) {
				System.out.println(ele+" ");
				f=true;
			}
		}
		System.out.println();
		if(f==false) {
			System.out.println("===================Ticket is not available===================");
			
		}
	}
//	@Override
	public void availableTicket() {
		System.out.println("<<<<<<<<<<<<<============Available Tickets==============>>>>>>>>");
		System.out.println("----------------------------------------------------------------");
		System.out.println("************===========<<\\Econonmy Class//>>===========********");
		System.out.println(ec);
		System.out.println("========================Premium Economy==========================");
		System.out.println(pec);
		System.out.println("========================Business Class============================");
		System.out.println(bc);
	}
	Customer createCustomer() {
		System.out.println("Enter Customer Details");
		System.out.println("Enter Customer Name: ");
		String cname=sc.next();
		System.out.println("Enter Customer id: ");
		int cid=sc.nextInt();
		System.out.println("Enter Customer Mobile no: ");
		long cphno=sc.nextLong();
		System.out.println("Enter Customer Email: ");
		String cemail=sc.next();
		System.out.println("Enter customer ammount: ");
		long camt=sc.nextLong();
		System.out.println("Enter pincode: ");
		int pincode=sc.nextInt();
		System.out.println("Enter Customer Dist: ");
		String dist=sc.next();
		System.out.println();
		System.out.println("Enter Customer State: ");
		String state=sc.next();
		
		Address a=new Address(pincode,dist,state);
		return new Customer(cname,cid, cphno, cemail, a, camt);
		
	}
	
	void mapSeat(LinkedHashMap<Integer,Customer>li,int seatNo, double amt) {
//		
		if(li.get(seatNo)==null) {
			Customer c=createCustomer();
			Set<Integer> a1;
			list.add(c);
			li.put(seatNo, c);
			c.setCamt(amt);
			System.out.println("Seat No: "+seatNo+" has been allocated for "+c.getCname());
			System.out.println("---------------------------------------------------------");
		}
		else {
			System.err.println("Seat is Empty...");
		}
	}
	
	public void allotSeat() {
		System.out.println("================Menu================");
		System.out.println("1.Economy class\n2.Premium Economy class \n3. Business Class");
		System.out.println("------------------------------------------------------------");
		
		Scanner sc=new Scanner(System.in);
		int ip=sc.nextInt();
		
		switch(ip) {
		case 1: System.out.println("Enter the seat no.");
				int seatNo1=sc.nextInt();
				if(seatNo1>=1 && seatNo1<=60) {
					mapSeat(ec,seatNo1,5500);
				}
				else {
					System.err.println("Enter correct seat no...");
				}
				break;
		case 2: System.out.println("Enter seat no.");
		int seatNo2=sc.nextInt();
		if(seatNo2>=1 && seatNo2<=30) {
			mapSeat(ec,seatNo2,6500);
		}
		else {
			System.err.println("Enter correct seat no...");
		}
		break;
		
		case 3: System.out.println("Enter seat no.");
		int seatNo3=sc.nextInt();
		if(seatNo3>=1 && seatNo3<=10) {
			mapSeat(ec,seatNo3,8000);
		}
		else {
			System.err.println("Enter correct seat no...");
		}
		break;
		
		default: System.err.println("Invalid Option...");
		
		

		}
	}
	void unMapSeat(LinkedHashMap<Integer,Customer>l1,int seatno) {
		if(l1.get(seatno)!=null) {
			Customer c1=l1.get(seatno);
			System.out.println(c1);
			System.out.println(c1.getCname()+" paid "+c1.getCamt()+" Rs. for booking");
		}
	}
	public void checkSeat() {
		System.out.println("===============Menu===========");
		System.out.println("1. Economy Class\n2. Premium Economy\n3.Business Class");
		int ip=sc.nextInt();
		System.out.println("Enter ur seat no:->");
		int seatno=sc.nextInt();
		
		switch(ip) {
		case 1: if(seatno>=1 && seatno<=60) {
			unMapSeat(ec,seatno);
		}
		else {
			System.err.println("Invalid seat no...");
		}
		break;
		case 2: if(seatno>=1 && seatno<=30) {
			unMapSeat(pec,seatno);
		}
		else {
			System.err.println("Invalid seat no...");
		}
		break;
		
		case 3: if(seatno>=1 && seatno<=10) {
			unMapSeat(bc,seatno);
		}
		else {
			System.err.println("Invalid seat no...");
		}
		break;
		
		default: System.err.println("Invalid Options...!!!");
		}
	}
	
	public void getCustomerById() {
		boolean f=false;
		System.out.println("Enter the customer id...");
		int cid=sc.nextInt();
		
		for(Customer ele: list) {
			if(ele.getCid()==cid) {
				System.out.println(ele);
				f=true;
				break;
			}
			if(f==false) {
				System.err.println("Invalid Customer id...");
			}
		}
	}
	public void exit() {
		System.out.println("Exiting");
		for(int i=1; i<=10; i++) {
			try {
				Thread.sleep(450);
			}
			catch(Exception e) {
//				e.printStackTrace();
				System.out.println(e);
			}
			System.err.print(".");
		}
		System.out.println("\nThank you! Visit Again...!!!");
	}

	
	
}
