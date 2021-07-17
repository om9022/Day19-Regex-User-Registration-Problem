package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
	public static void main(String[] args) 
	{
		System.out.println("Welcome to User Registration");
		UserRegistration details = new UserRegistration();
		String firstName ="Firstname";
		details.checkFirstName(firstName);
		String lastName ="Lastname";
		details.checkLastName(lastName);
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
			System.out.println("Larst name is invalid");		}
	}
}
