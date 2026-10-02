package Section7_OOP.ChallengeConstructor;

public class Customer {

    private String name;
    private double creditLimit;
    private String email;

    public Customer(String name, double creditLimit, String email) {
        this.name = name;
        this.creditLimit = creditLimit;
        this.email = email;
    }

    public Customer() {
        this("Mark", 5000, "Mark@email.com");

        // this.name = name;
        // this.creditLimit = creditLimit;
        // this.email = email;
    }

     public Customer(String name, String email) {
        this(name, 4000, email);
    }

    public String getName() {
        return name;
    }
    public double getCreditLimit() {
        return creditLimit;
    }
    public String getEmail() {
        return email;
    }

    
}
