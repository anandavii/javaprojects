///////////////////////////////////////////////////////////////////////
// Description: This program creates BankAccount and SavingsAccount  //
// Classes to implement Constructor, Inheritance and Abstract Class  //
//                                                                   //
// Assignment: Exercise 10.1                                         //
// Course: ITMD-510-05                                               //
// Date: 09/19/2023                                                  //
//                                                                   //
// Author: Abhishek Anand                                            //
//                                                                   //
///////////////////////////////////////////////////////////////////////

import java.util.ArrayList;
import java.util.Random;

public class BankService {
    public static void main(String[] args) {

        ArrayList<SavingsAccount> accounts = new ArrayList<>();
        Random random = new Random();

        /**
         * Creating random SavingsAccount
         * objects
         */
        for (int i = 0; i < 10; i++) {
            double balance = random.nextDouble(1, 100);
            double interest_rate = random.nextDouble(1, 4);

            SavingsAccount account = new SavingsAccount(balance, interest_rate);
            accounts.add(account);
        }

        for (SavingsAccount savingsAccount : accounts) {
            savingsAccount.deposit(random.nextDouble());
            savingsAccount.withdraw(random.nextDouble());
            savingsAccount.monthlyProcess();
            System.out.println(savingsAccount);
        }
    }
}
