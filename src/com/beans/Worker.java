package com.beans;

public class Worker {
	int id;
	String name;
	String phone;
	String skills;
	double rating;
	
	public Worker(int id, String name, String phone, String skills) {
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.skills = skills;
		this.rating = 0.0;
	}
	public void display() {
		System.out.println(id + " | " + name + " | " + skills + " | Rating: " + rating);
	}

}
