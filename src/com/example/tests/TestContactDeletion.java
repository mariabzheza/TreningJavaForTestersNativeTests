package com.example.tests;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.example.fw.Contact;

public class TestContactDeletion extends TestBase{
		
	@Test
	//Must be One or Two Contacts for normally Run This Test!!!!!
	public void shouldDeleteContactWithValidData () {
		Contact firstSelectedContactBeforeDeletion = app.getContactHelper().getFirstContact();
		app.getContactHelper().deleteFirstContact();
		Contact firstSelectedContactAfterDeletion = app.getContactHelper().getFirstContact();
		app.getContactHelper().closeApplication();
		Assert.assertNotEquals(firstSelectedContactAfterDeletion, firstSelectedContactBeforeDeletion);
	}

}
