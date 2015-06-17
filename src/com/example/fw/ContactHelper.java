package com.example.fw;

public class ContactHelper extends HelpersBase{

	public ContactHelper(ApplicationManager applicationManager) {
		super(applicationManager);
	}

	public void createContact(Contact contact) {
		initContactCreation();
		fillContactForm(contact);
		confirmContactCreation();
	}

	private void initContactCreation() {
		manager.getAutoitHelper()
			.winWaitAndActivate("AddressBook Portable", "", 5000)
			.click("Add").winWaitAndActivate("Add Contact", "", 5000);
	}
	
	private void fillContactForm(Contact contact) {
		manager.getAutoitHelper()
			.send("TDBEdit12", contact.firstName)
			.send("TDBEdit11", contact.lastName);
	}
	
	private void confirmContactCreation() {
		manager.getAutoitHelper()
			.click("Save")
			.winWaitAndActivate("AddressBook Portable", "", 5000);
	}

	public Contact getFirstContact() {
		//manager.getAutoitHelper().focus("TListView1")
		manager.getAutoitHelper()
			.winWaitAndActivate("AddressBook Portable", "", 5000)
			.click("TListView1")
			.send("{DOWN}{SPACE}")
			.click("Edit")
			.winWaitAndActivate("Update Contact", "", 5000);
		
		Contact contact = new Contact()
			.setFirstName(manager.getAutoitHelper().getText("TDBEdit12"))
			.setLastName(manager.getAutoitHelper().getText("TDBEdit11"));
		
		manager.getAutoitHelper()
			.click("Cancel")
			.winWaitAndActivate("AddressBook Portable", "", 5000)
			.click("Exit");
			//.click("TRbButton9");
		
		return contact;
	}

}
