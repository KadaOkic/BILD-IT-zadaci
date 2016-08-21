package zadaci_20_08_2016;

import java.util.Date;

public class Account {

	// define variables
	private int id;
	private double balance; // balance for account
	private double annualInterestRate; // stores the current interest rate
	private Date dateCreated; // stores the date account created

	// no arg construtor
	Account() {
	}

	Account(int newId, double newBalance) {
		id = newId;
		balance = newBalance;
	}

	// constructor with specific id and initial balance and annul interest rate
	Account(int newId, double newBalance, double newAnnualInterestRate) {
		id = newId;
		balance = newBalance;
		annualInterestRate = newAnnualInterestRate;
		dateCreated = new Date();
	}

	// accessor/mutator methods for id, balance, and annualInterestRate
	public int getId() {
		return id;
	}

	public double getBalance() {
		return balance;
	}

	public double getAnnualInterestRate() {
		return annualInterestRate;
	}

	public void setId(int newId) {
		id = newId;
	}

	public void setBalance(double newBalance) {
		balance = newBalance;
	}

	public void setAnnualInterestRate(double newAnnualInterestRate) {
		annualInterestRate = newAnnualInterestRate;
	}

	// accessor method for dateCreated
	public Date getDate() {
		return dateCreated;
	}

	 //method that calculates monthly interest
	double getMontlyInterest() {
		return balance * ((annualInterestRate/100) / 12);
	}

	//method that calculates monthly interest rate
	double getMonthlyInterestRate() {
		return (annualInterestRate/100) / 12;
	}

	// define method deposit
	public void deposit(double deposit) { // method that adds funds to the
											// balance
		balance += deposit;
	}
	//method that checks if withdrawal is posible and than remove funds from account
	public void withdraw(double withdraw) {
		if (balance - withdraw >= 0) {
			balance = balance - withdraw;
		}

	}

}
