public class Contact {
    private String name;
    private String phoneNumber;
    private String emailAddress;
    private String address;

    public Contact(String name, String phoneNumber, String emailAddress, String address) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.emailAddress = emailAddress;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public String getAddress() {
        return address;
    }

    public String toString() {
        return "Name: " + name + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Email Address: " + emailAddress + "\n" +
                "Address: " + address + "\n";
    }
}
