package com.bridgelabz.userregistration;

import java.util.regex.Pattern;

public class UserRegistrationService {
	/**
	 * @param method to check first name 
	 */
	public void checkFirstName(String firstName) 
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
	public void checkLastName(String lastName) 
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
	public void checkEmailAddress(String emailAddress)
	{
		boolean isMatched = Pattern.compile("^[0-9a-zA-Z]+([.,+,_,-]{1}[0-9a-zA-Z]+)*@[0-9a-zA-Z]+[.]{1}[a-zA-Z]{2,3}([.]{1}[a-zA-Z]{2})?").matcher(emailAddress).matches();
		if (isMatched) 
		{			
			System.out.println("Email is valid");
		}
		else
		{			
			System.out.println("Email is invalid");
		}
	}
	/**
	 * @param method to check phone number 
	 */
	public void checkPhoneNUmber(String phoneNumber) 
	{
		boolean IsMatched = Pattern.compile("^[0-9]{2}[ ][0-9]{10}$").matcher(phoneNumber).matches();
		if(IsMatched)
		{
			System.out.println("Phone Number is correct");
		}
		else 
		{
			System.out.println("Phone number is invalid");
		}
		
	}
}
