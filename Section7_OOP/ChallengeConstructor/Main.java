package Section7_OOP.ChallengeConstructor;

public class Main {
    public static void main(String[] args) {

        Customer c1 = new Customer("Pedro", 3000, "Pedro@email.com");
        System.out.println("Name= " + c1.getName() + ", Credit Limit= " + c1.getCreditLimit() + ", Email= " + c1.getEmail());


        Customer c2 = new Customer();
        System.out.println("Name= " + c2.getName() + ", Credit Limit= " + c2.getCreditLimit() + ", Email= " + c2.getEmail());

        Customer c3 = new Customer("Bob", "Bob@email.com");
        System.out.println("Name= " + c3.getName() + ", Credit Limit= " + c3.getCreditLimit() + ", Email= " + c3.getEmail());
    }
}
