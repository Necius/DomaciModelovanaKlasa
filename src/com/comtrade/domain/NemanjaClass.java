package com.comtrade.domain;

public class NemanjaClass {
	String firstName;
	String lastName;
	Integer height;
	
	public static void main(String[] args) {
		NemanjaClass nemanja = new NemanjaClass();

		nemanja.firstName = "Nemanja";
		nemanja.lastName = "Jovanovic";
		nemanja.height = 182;

		nemanja.FirstName();
		nemanja.LastName();
		nemanja.Height();

	}

	public void FirstName() {
		System.out.println("Moje ime je " + firstName + ".");
	}

	public void LastName() {
		System.out.println("Prezivam se " + lastName + ".");
	}

	public Integer Height() {
		System.out.println("Visok sam " + height + "cm.");
		return height;
	}

	

}
