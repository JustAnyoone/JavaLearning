package Section7_OOP.ChallegeObjectOrientered;

public class Main {
    public static void main(String[] args) {

        Account leonAccount = new Account("12345", 1000.0, "Leon Brown",
         "myemail@bob.com", "(087) 123-4567");
        
         System.out.println(leonAccount.getBalance());
         System.out.println(leonAccount.getNumber());
        // leonAccount.setNumber("12345");
        // leonAccount.setBalance(1000.00);
        // leonAccount.setCustomerName("Leon Brown");
        // leonAccount.setCustomerEmail("myemail@bob.com");
        // leonAccount.setCustomerPhone("(087) 123-4567");

        leonAccount.withdraw(100);
        leonAccount.deposit(250);
        leonAccount.withdraw(50);

        leonAccount.withdraw(200);

        leonAccount.deposit(100);
        leonAccount.withdraw(45.55);
        leonAccount.withdraw(54.46);

        Account timsAccount = new Account("Tim", "tim@email.com",
         "12345");
         System.out.println("AccountNo:" + timsAccount.getNumber()
          + "; name " + timsAccount.getCustomerName());
    }
}
