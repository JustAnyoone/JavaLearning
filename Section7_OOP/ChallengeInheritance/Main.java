package Section7_OOP.ChallengeInheritance;

public class Main {
    public static void main(String[] args) {
        
        Worker john = new Worker("John", "02/09/1998", "01/02/2025");
        System.out.println(john);
        System.out.println("Age = " + john.getAge());
        System.out.println("Pay = " + john.collectPay());

        SalariedEmployee joe = new SalariedEmployee("Joe", "11/11/1990", "03/03/2020",35000);
        System.out.println(joe);
        System.out.println("Joe's Paycheck = $" + joe.collectPay());

        joe.retire();
        System.out.println("Joe's Pension check = $" + joe.collectPay());

        HourlyEmployee mary = new HourlyEmployee("Mary", "04/04/1970", "03/03/2021", 15);
        System.out.println(mary);
        System.out.println("Mary's Paycheck = $" + mary.collectPay());
        System.out.println("Mary's Holiday Pay = $" + mary.getDoublePay());
    }
    
}
