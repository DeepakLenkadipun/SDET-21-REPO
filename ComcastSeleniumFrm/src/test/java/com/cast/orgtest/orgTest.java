package com.cast.orgtest;

import org.testng.annotations.Test;

public class orgTest {
	
	@Test(groups="smoketest")
	public void createOrganizationTest() {
			
			System.out.println("execute createorganizationTest");
		}
	@Test(groups="regressiontest")
	public void createOrganizationWithcontactTest() {
		
		System.out.println("execute createorganizationwithcontactTest");
	}
	@Test(groups="regressiontest")
	public void deletOrganizationTest() {
		
		System.out.println("execute deleteorganizationTest");
	}
	

}
