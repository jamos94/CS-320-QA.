//Contact.java

package contact;

// Member variables

public class Contact {

String contactID;

String firstName;

String lastName;

String phoneNumber;

String address;

// Parameterized constructor

public Contact(String contactID, String firstName, String lastName, String phoneNumber, String address) {

super();

this.contactID = contactID;

this.firstName = firstName;

this.lastName = lastName;

this.phoneNumber = phoneNumber;

this.address = address;

}

// Getter ContactID

public String getContactID() {

return contactID;

}

// Setter ContactID

public void setContactID(String contactID) {

this.contactID = contactID;

}

// Getter firstName

public String getFirstName() {

return firstName;

}

// Setter firstName

public void setFirstName(String firstName) {

this.firstName = firstName;

}

// Getter lastName

public String getLastName() {

return lastName;

}

// Setter lastName

public void setLastName(String lastName) {

this.lastName = lastName;

}

// Getter PhoneNumber

public String getPhoneNumber() {

return phoneNumber;

}

// Setter PhoneNumber

public void setPhoneNumber(String phoneNumber) {

this.phoneNumber = phoneNumber;

}

// Getter Address

public String getAddress() {

return address;

}

// Setter Address

public void setAddress(String address) {

this.address = address;

}

// Check if the two contacts are the same or not.

@Override

public String toString() {

return "Contact [contactID=" + contactID + ", firstName=" + firstName + ", lastName=" + lastName + ", phoneNumber=" + phoneNumber + ", address=" + address + "]";

}

}