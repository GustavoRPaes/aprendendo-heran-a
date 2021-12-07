package entities;

import java.util.Locale;

public class BusinessAccount extends Account {

	private Double loanLimit;

	public BusinessAccount() {
		super();
	}

	// Chamando construtor da Super Classe
	public BusinessAccount(Integer number, String holder, Double balance, Double loanLimit) {
		super(number, holder, balance);
		this.loanLimit = loanLimit;
	}

	public Double getLoanLimit() {
		return loanLimit;
	}

	public void setLoanLimit(Double loanLimit) {
		this.loanLimit = loanLimit;
	}

	public void loan(double amount) {
		Locale.setDefault(Locale.US);
		if (amount <= loanLimit) {   //Testa para ver se o valor é menor ou igual ao limite de emprestimo
			balance += amount - 10.0;
		}
	}
}
