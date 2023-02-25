import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        AddressBook addressBook = new AddressBook();
        try (Scanner input = new Scanner(System.in)) {
            int choice;

            do {
                System.out.println("Address Book Options:");
                System.out.println("1. Add Contact");
                System.out.println("2. Display Contacts");
                System.out.println("3. Search Contact");
                System.out.println("4. Quit");
                System.out.print("Enter your choice: ");
                choice = input.nextInt();

                switch (choice) {
                    case 1:
                        // Add a new contact
                        System.out.print("Enter the contact name: ");
                        String name = input.next();
                        System.out.print("Enter the contact phone number: ");
                        String phoneNumber = input.next();
                        System.out.print("Enter the contact email address: ");
                        String emailAddress = input.next();
                        System.out.print("Enter the contact address: ");
                        String address = input.next();
                        Contact contact = new Contact(name, phoneNumber, emailAddress, address);
                        addressBook.addContact(contact);
                        break;
                    case 2:
                        // Display all contacts
                        addressBook.displayContacts();
                        break;
                    case 3:
                        // Search for a contact by name
                        System.out.print("Enter the name to search for: ");
                        name = input.next();
                        addressBook.searchContact(name);
                        break;
                    case 4:
                        // Exit the program
                        System.out.println("Goodbye!");
                        break;
                    default:
                        System.out.println("Invalid choice.");
                }
            } while (choice != 4);
        }

    }
}