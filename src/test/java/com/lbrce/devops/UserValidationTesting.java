package com.lbrce.devops;

import org.testng.Assert;
import org.testng.annotations.Test;

public class UserValidationTesting {
	@Test
	public void testCase1()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "srinu@12345"));
	}
	@Test
	public void testCase2()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("Srinu", "Srinu@12345"));
	}
	@Test
	public void testCase3()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(true,uv.check("lbrce", "lbrce@76"));
	}
	@Test
	public void testCase4()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("SRINU", "srinu@12345"));
	}
	@Test
	public void testCase5()
	{
		UserValidation uv=new UserValidation();
		Assert.assertEquals(false,uv.check("srinu", "SRINU@12345"));
	}
}
