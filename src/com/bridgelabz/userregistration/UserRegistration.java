package com.bridgelabz.userregistration;

import java.util.Scanner;
import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) 
	{
		UserRegistration details = new UserRegistration();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Welcome to User Registration");
		
		//asking first name
		System.out.println("Enter First name");
		String firstName =scanner.next();
		details.checkFirstName(firstName);
		
		//asking last name 
		System.out.println("Enter Last name");
		String lastName =scanner.next();
		details.checkLastName(lastName);

		//asking Email address 
		System.out.println("Enter Email address");
		String emailAddress = scanner.next();
		details.checkEmailAddress(emailAddress);	
	
		scanner.close();
	}

	/**
	 * @param method to check first name 
	 */
	private void checkFirstName(String firstName) 
	{
		boolean IsMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(firstName).matches();
		if(IsMatched)
		{
			System.out.println("First name is correct");
		}
		else 
		{
			System.out.println("First name is invalid");
		}
	}
	
	/**
	 * @param method to check last name 
	 */
	private void checkLastName(String lastName) 
	{
		boolean IsMatched = Pattern.compile("^[A-Z]{1}[a-z]{3,}$").matcher(lastName).matches();
		if(IsMatched)
		{
			System.out.println("Last name is correct");
		}
		else 
		{
			System.out.println("Larst name is invalid");
		}
	}
	
	/**
	 * @param method to check email address 
	 */
	private void checkEmailAddress(String emailAddress)
	{
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
		if (isMatched) 
		{			
			System.out.println("Email is valid");
		}
		else
		{			
			System.out.println("Email is invalid");	}
	}
}
