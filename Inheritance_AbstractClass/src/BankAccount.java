/**
 * This is the abstract BankAccount Class
 * contains various methods for
 * deposit, withdrawal and service charges
 */
public abstract class BankAccount {
    // Variable declaration
    private double balance, number_deposits, number_withdrawal, interest_rate;

    protected double service_charge;

    public BankAccount(double balance, double interest) {
        this.balance = balance;
        this.interest_rate = interest;
    }

    /**
     * deposit method to add
     * balance to account
     * 
     * @param amount
     */
    public void deposit(double amount) {
        this.balance += amount;
        this.number_deposits++;
    }

    /**
     * withdraw method to deduct
     * balance from account
     * 
     * @param amount
     */
    public void withdraw(double amount) {
        this.balance -= amount;
        this.number_withdrawal++;
    }

    /**
     * calcInterest method to calculate
     * interest accured
     */
    public void calcInterest() {
        double monthly_interest = interest_rate / 12;
        monthly_interest = balance * monthly_interest;
        this.balance += monthly_interest;

    }

    /**
     * monthlyProcess method to
     * track deposits and withdrawals
     * and calculate service charge
     */
    public void monthlyProcess() {
        this.balance -= service_charge;
        calcInterest();
        this.number_deposits = 0;
        this.number_withdrawal = 0;
        this.service_charge = 0;
    }

    // getter setter for all variables
    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getNumber_deposits() {
        return number_deposits;
    }

    public void setNumber_deposits(double number_deposits) {
        this.number_deposits = number_deposits;
    }

    public double getNumber_withdrawl() {
        return number_withdrawal;
    }

    public void setNumber_withdrawl(double number_withdrawl) {
        this.number_withdrawal = number_withdrawl;
    }

    public double getInterest_rate() {
        return interest_rate;
    }

    public void setInterest_rate(double interest_rate) {
        this.interest_rate = interest_rate;
    }

}