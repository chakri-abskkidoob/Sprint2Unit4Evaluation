package com.evaluation2;

public class Ticket {
	int ticketid;
	int price;
	int availableTickets;
	int nooftickets;
	public Ticket(int ticketid, int price, int availableTickets, int nooftickets) {
		super();
		this.ticketid = ticketid;
		this.price = price;
		this.availableTickets = availableTickets;
		this.nooftickets = nooftickets;
	}
	
	public int getTicketid() {
		return ticketid;
	}
	public void setTicketid(int ticketid) {
		this.ticketid = ticketid;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAvailableTickets() {
		return availableTickets;
	}
	public void setAvailableTickets(int availableTickets) {
		this.availableTickets = availableTickets;
	}
	public void calculateTicketCost() {
		if(availableTickets > 0) {
			int totalamount = nooftickets*price;
			System.out.println("Available tickets:"+availableTickets);
			System.out.println("Total amount:"+totalamount);
			System.out.println("Available tickets after booking:"+(availableTickets-nooftickets));
			

		}
		else {
			System.out.println(-1);
		}
		
	}
	public static void main(String[] args) {
		
		Ticket t1 = new Ticket(123, 100, 25, 5);
		t1.calculateTicketCost();
		
		
		
		Ticket t2 = new Ticket(124, 100, 0, 2);
		t2.calculateTicketCost();
	}
	
}
