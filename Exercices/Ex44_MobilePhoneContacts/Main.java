package Ex44_MobilePhoneContacts;

public class Main {
    public static void main(String[] args) {
        MobilePhone phone = new MobilePhone("11999998888");

        System.out.println(phone.addNewContact(Contact.createContact("Bob", "31415926")));
        System.out.println(phone.addNewContact(Contact.createContact("Alice", "16180339")));
        System.out.println(phone.addNewContact(Contact.createContact("Bob", "0")));
        phone.printContacts();

        System.out.println(phone.queryContact("Alice").getPhoneNumber());
        System.out.println(phone.updateContact(new Contact("Bob", ""), new Contact("Bob", "999")));
        System.out.println(phone.removeContact(new Contact("Alice", "")));
        phone.printContacts();
    }
}

