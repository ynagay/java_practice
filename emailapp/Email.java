package emailapp;

import java.util.Scanner;

public class Email {
	private String firstName;
	private String lastName;
	private String password;
	private int defaultPasswordLength = 10; 
	private String department;
	private int mailboxCapacity = 500;
	private String alternateEmail;
	private String email;
	private String companySuffix = "company.com"; 
	
	// Constructor to receive the first name and last name
	
	public Email(String firstName, String lastName) {
		
		this.firstName = firstName; // class level variable = local variable
		this.lastName = lastName;
		System.out.println("NEW WORKER: " + this.firstName +" "+ this.lastName);
		
		// Call a method asking for the department - return department
		this.department = setDepartment();
		//System.out.println("Department: " + this.department);
		
		// Call a method that return random password
		
		this.password = randomPassword(defaultPasswordLength);
		System.out.println("Your password is " + this.password);
		
		// Combine elements to generate email
		this.email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;
		//System.out.println("Your email is " + this.email);
	}
	
	// Ask for the department
	
	private String setDepartment() {
		System.out.println("DEPARTMENT CODES:\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter the department code: ");
		Scanner in = new Scanner(System.in);
		int depChoice = in.nextInt();
		if(depChoice == 1) {return "sales";}
		else if(depChoice == 2) {return "dev";}
		else if(depChoice == 3) {return "acc";}
		else {return "None";}
	}
	
	//Generate random password
	
	private String randomPassword(int length) {
		
		String passwordSet = "ABCDEFGIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
		char [] password = new char[length];
		for(int i=0; i<length; i++) {
		int rand = (int) (Math.random() * passwordSet.length());
		password[i] = passwordSet.charAt(rand);
		}
		
		return new String(password);
	
	}
	
	// Set mailbox capacity
	
	public void setEmailCapacity(int capacity) {
		this.mailboxCapacity = capacity;
	}
	
	public int getEmailCapacity() {
		return mailboxCapacity;
	}
	
	// Set the alternate email
	public void setAlternateEmail(String altEmail) {
		this.alternateEmail = altEmail;
	}
	
	public String getAlternateEmail() {
		return alternateEmail;
	}
	
	// Change the password
	
	public void changePassword(String password) {
		this.password = password;
	}
	
	public String getPassword() {
		return password;
	}
	
	public String showInfo() {
		
		return "DISPLAY NAME: " + firstName + " " + lastName +
				"\nCOMPANY EMAIL: " + email +
				"\nMAILBOX CAPACITY:" + mailboxCapacity + "mb";
	}
	
}
