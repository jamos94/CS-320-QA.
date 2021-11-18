//ContactService.java

package contact;

import java.util.ArrayList; //import array list


public class ContactService {

	// Contains a list of contacts

	private ArrayList<String> contacts;

	// Default constructor

	public ContactService() {
		ArrayList<String> contacts = new ArrayList<String>();
		
	}

	// Adds contact to our list if the contact is not present.

	public boolean addContact(Contact contact){

		// Determine if the contact is present.

		boolean isPresent= false;

		for (Contact contactList:contacts) {

			if (contactList.equals(contact)) {

				isPresent = true;
				
			}
			
		}

// If the contact is not present then we add contact, then return true.

		if (!isPresent) {

			contacts.add(contact);

				return true;
				
		}

		else {

			return false;
			
		}

	}

// Delete the contact with the given contactId if the contact is present in our list.

	public boolean deleteContact(String contactID) {

		for (Contact contactList:contacts) {

			if (contactList.getContactID().equals(contactID)) {

				contacts.remove(contactList);

				return true;
				
			}
			
		}
		
		return false;
		
	}

// Update the contact with the given contactId. If the contact is updated in our list then contact will be firstName, lastName, phoneNumber and address.

	public boolean updateContact(String contactID, String firstName, String lastName, String phoneNumber, String address) {

		for (Contact contactList:contacts) {

			if (contactList.getContactID().equals(contactID)) {

				if(!firstName.equals("") && !(firstName.length()>10)) {

					contactList.setFirstName(firstName);
					
				}

				if(!lastName.equals("") && !(lastName.length()>10)) {

					contactList.setFirstName(lastName);
					
				}

				if(!phoneNumber.equals("") && (phoneNumber.length()==10)) {

					contactList.setFirstName(phoneNumber);
				
				}

				if(!address.equals("") && !(address.length()>30)) {
					contactList.setFirstName(address);
					
				}
				return true;
				
			}
			
		}
		return false;
		
	}

}