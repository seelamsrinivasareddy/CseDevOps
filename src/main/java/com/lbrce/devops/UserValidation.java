package com.lbrce.devops;

import java.util.ResourceBundle;

public class UserValidation {
	public boolean check(String uidIn,String pswIn)
	{
		ResourceBundle rb=ResourceBundle.getBundle("config");
		String uid=rb.getString("username");
		String psw=rb.getString("password");
		if(uid.equals(uidIn)&&psw.equals(pswIn))
			return true;
		else
			return false;
	}
	/*public static void main(String[] rgs)
	{
		System.out.println(new UserValidation().check("lbrce","lbrce@76"));
	}*/
}
