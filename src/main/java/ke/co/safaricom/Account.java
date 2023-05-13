package ke.co.safaricom;

public class Account {
    private String fullName;
    private String phoneNumber;
    private double accountBalance;

    // Empty Constructor Method
    public Account() {
    }

    // Constructors
    public Account(String fullName, String phoneNumber) {
        this.fullName = fullName;
        this.phoneNumber = phoneNumber;
        this.accountBalance = 0.0;
    }

    // Getters and Setters
    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    private void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }
    public double deposit(double amount){
        if (amount < 100){
            System.out.println("Amount cannot be less than 100");
            return 0.0;
        } else {
            double currentBalance = this.getAccountBalance();
            double newBalance = currentBalance + amount;
            this.setAccountBalance(newBalance);
            return this.getAccountBalance();
        }
    }

    public boolean withdraw(double amount){
        double txnFee = 100.00;
        if (amount < 100) {
            System.out.println("Withdrawal amount cannot be less than 100");
            return false;
        } else if(amount + txnFee > this.getAccountBalance()){
            System.out.println("Not enough money in your account");
            return false;
        } else {
            double effectiveAmount = amount + txnFee;
            double newBalance = this.getAccountBalance() - effectiveAmount;
            this.setAccountBalance(newBalance);
            return true;
        }
    }
}
