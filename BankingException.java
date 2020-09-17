// Create a CheckingAccount class containing deposit() and withdraw() method that throws
// an InsufficientFundsException in case of withdraw if the amount to be withdrawn is
// greater than the total amount in the account..


import java.io.*; 
import java.util.Scanner;

class InsufficientFundsException extends Exception { 
	private double amount; 
	public InsufficientFundsException(double amount) { 
		this.amount = amount; 
	} 
	public double getAmount() { 
		return amount; 
	} 
}


class CheckingAccount { 
	private double balance; 
	private int number; 
	public CheckingAccount(int number) { 
		this.number = number; 
	} 
	public void deposit(double amount) { 
		balance += amount; 
	} 
	public void withdraw(double amount) throws InsufficientFundsException { 
		if(amount <= balance) 
		{ 
			balance -= amount; 
		} 
		else { 
			double needs = amount - balance; 
			throw new InsufficientFundsException(needs); 
		} 
	} 
	public double getBalance() { 
		return balance; 
	}
	public int getNumber() { 
		return number; 
	}
}


public class BankingException { 
	public static void main(String [] args) { 
		CheckingAccount c = new CheckingAccount(15000); 
		System.out.println("Depositing $15000..."); 
		c.deposit(1200.00); 
		try { 
			System.out.println("Withdrawing $400..."); 
			c.withdraw(400.00); 
			System.out.println("\nWithdrawing $900..."); 
			c.withdraw(900.00); 
		}
		catch(InsufficientFundsException e) {
			System.out.println("Sorry, but you are sort $" + e.getAmount()); 
			e.printStackTrace(); 
		}
	}
}