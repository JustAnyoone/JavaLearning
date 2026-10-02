package Section7_OOP.ChallegeObjectOrientered;
//account number
//account balance
//customer name
//email
//phone number

//getters and setters for all this fields

//two methods, one for depositing fund into the account and one for withdrawing funds from the account.
public class Account {
    
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhone;

    public Account() { //<--(public) always public, Account() <- same name of the class
        this("56789", 2.50, "Default name", //<-- Always in first line
         "Default adress", "Default phone");
        System.out.println("Empty constructor called");
    } 
//---------------Construction---------------------
    public Account(String number, double balance, String customerName,
                String email, String phone){
        System.out.println("Account constructor with parameters called");
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        customerEmail = email;
        customerPhone = phone;


    }

//--------------------
    public Account(String customerName, String customerEmail, String customerPhone) {
        this("99999", 100.55, customerName, customerEmail, customerPhone);
        // this.customerName = customerName;
        // this.customerEmail = customerEmail;
        // this.customerPhone = customerPhone;
    }
//------------------------
    public void deposit(double depositValue){
        balance += depositValue;
        System.out.println("The value of " + depositValue + "$ was deposited into your account. Your new balance is: " + balance + "$");
    }

    public void withdraw(double withdrawalValue){
        if (balance - withdrawalValue < 0) {
            System.out.println("You don't have funds ! You only have $"+ balance +" in your account.");
        } else {
            balance -= withdrawalValue;
            System.out.println("Withdrawal of $"+ withdrawalValue +" processed Now you have in your balance = $"+balance);
        }
    }

    public String getNumber() {
        return number;
    }
    public void setNumber(String accountNumber) {
        this.number = accountNumber;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double accountBalance) {
        this.balance = accountBalance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String costumerName) {
        this.customerName = costumerName;
    }
    public String getCustomerEmail() {
        return customerEmail;
    }
    public void setCustomerEmail(String email) {
        this.customerEmail = email;
    }
    public String getCustomerPhone() {
        return customerPhone;
    }
    public void setCustomerPhone(String phoneNumber) {
        this.customerPhone = phoneNumber;
    }

    

}
