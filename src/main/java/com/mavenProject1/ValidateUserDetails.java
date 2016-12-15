package com.mavenProject1;

public class ValidateUserDetails {

	public boolean validateUser(String Username, String Password )
	{
		if( Username.equals("Siddharth") && Password.equals("xyz12345"))
		{
			return true;
		}
		return false;
	}
	
}
