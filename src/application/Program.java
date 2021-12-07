package application;

import entities.Account;
import entities.BusinessAccount;
import entities.SavingAccount;

public class Program {

	public static void main(String[] args) {

		Account acc = new Account(1001, "Alex", 1000.0);
		acc.withdraw(200.0);
		System.out.println(acc.getBalance());
		
		Account acc1 = new SavingAccount(999, "Pedro", 1000.0, 0.01);
		acc1.withdraw(200.0);
		System.out.println(acc1.getBalance());
		BusinessAccount bacc = new BusinessAccount(1002, "Maria", 0.0, 500.0);

		// UPCASTING
		// Uma bacc é uma acc

		Account acc2 = bacc;
		Account acc3 = new BusinessAccount(1003, "Bob", 1000.0, 500.0);
		acc3.withdraw(200.0);
		System.out.println(acc3.getBalance());
		Account acc4 = new SavingAccount(1004, "Anna", 0.0, 0.01);

		// DOWNCASTING

		BusinessAccount acc5 = (BusinessAccount) acc2;

		if (acc4 instanceof BusinessAccount) {
			BusinessAccount acc6 = (BusinessAccount) acc4;
			acc5.loan(200.0);
			System.out.println("Loan!!");
		}

		if (acc4 instanceof SavingAccount) {
			SavingAccount acc6 = (SavingAccount) acc4;
			acc6.updateBalance();
			System.out.println("Update!!");
			;
		}
	}

}
