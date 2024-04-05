/**
 * SavingsAccount class to process
 * withrawal, deposit and mothlyPrcoess
 * methods
 */
public class SavingsAccount extends BankAccount implements Comparable<SavingsAccount> {
    static boolean isActive;

    public SavingsAccount(double balance, double interest) {
        super(balance, interest);

        isActive = super.getBalance() >= 25;

    }

    @Override
    public void withdraw(double amount) {
        if (super.getBalance() < amount) {
            System.exit(0);
        }
        if (super.getBalance() < 25) {
            isActive = false;

        } else {
            super.withdraw(amount);
        }
    }

    @Override
    public void deposit(double amount) {
        super.deposit(amount);
        if (super.getBalance() > 25) {
            isActive = true;
        }
    }

    @Override
    public void monthlyProcess() {
        if (super.getNumber_withdrawl() > 4) {
            super.service_charge += (getNumber_withdrawl() - 4);
        }
        if ((super.getBalance() - super.service_charge) < 25) {
            isActive = false;
        }
    }

    @Override
    public int compareTo(SavingsAccount other) {
        return Double.compare(this.getBalance(), other.getBalance());

    }

    /**
     * toString method to return
     * string representation of
     * BankAccount members
     */
    @Override
    public String toString() {
        return "Savings Account Details" +
                "\n[ Account status: " + isActive +
                ", Available Balance: " + String.format("%1.2f", super.getBalance()) +
                ", Annual Interest Rate: " + String.format("%1.2f", super.getInterest_rate()) +
                ", Number of Withdrawals: " + super.getNumber_withdrawl() +
                ", Number of Deposits: " + super.getNumber_deposits() +
                ']';
    }
}
