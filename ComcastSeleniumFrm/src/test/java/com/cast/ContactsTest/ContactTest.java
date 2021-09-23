package com.cast.ContactsTest;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class ContactTest {
	
	
	@Test(groups="smoketest")
	public void createContactTest() {
		String URL=System.getProperty("url");
		String USERNAME=System.getProperty("username");
		String PASSWORD=System.getProperty("password");
		String browser=System.getProperty("browserName");
		
		System.out.println(URL);
		System.out.println(USERNAME);
		System.out.println(PASSWORD);
		System.out.println(browser);	
			System.out.println("execute createcontactTest");
		}
	@Test(groups="regressiontest")
	public void createContactWithOrgTest() {
		
		System.out.println("execute createcontactwithorgTest");
	}
	@Test(groups="regressiontest")
	public void deletContactTest() {
		
		System.out.println("execute deletecontactTest");
	}
	@Test
 public void searchContactTest() {
		
		System.out.println("execute searchContactTest");
  }
}
