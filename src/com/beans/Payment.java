package com.beans;

public class Payment {
	int Workerid;
	double quantity;
	double rate;
	double total;
	
	public Payment(int Workerid, double quantity, double rate) {
		this.Workerid = Workerid;
		this.quantity = quantity;
		this.rate = rate;
		this.total = quantity * rate;
	}
	public void display() {
		System.out.println("Worker ID:" + Workerid + " | Quantity: " + quantity + " | Rate: " + rate + " | Total:" + total);
		
	}

}
