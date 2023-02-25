import java.util.ArrayList;

public class AddressBook {
    //ArrayList to store the contacts
    private ArrayList<Contact> contacts = new ArrayList<Contact>();

    // to add a new contact
    public void addContact(Contact contact) {
        contacts.add(contact);
    }

    //to display all contacts
    public void displayContacts() {
        System.out.println("Address Book:");
        for (Contact contact : contacts) {
            System.out.println(contact.toString());
        }
    }

    //to search for a contact by name
    public void searchContact(String name) {
        boolean found = false;
        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Contact found:");
                System.out.println(contact.toString());
                found = true;
            }
        }
        if (!found) {
            System.out.println("Contact not found.");
        }
    }
}