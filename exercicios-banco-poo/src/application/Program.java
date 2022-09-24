package application;

import java.util.Scanner;

import entities.BankingAccount;

public class Program {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BankingAccount account;
		
		System.out.println("Enter account number: ");
		int accountNumber = sc.nextInt();
		System.out.println("Enter account holder: ");
		sc.nextLine();
		String name = sc.nextLine();
		System.out.println("Is there an initial deposit (y/n)? ");
		char response = sc.next().charAt(0);
		if (response == 'y') {
			System.out.println("Enter a initial deposit value: ");
			double initialDeposit = sc.nextDouble();
			account = new BankingAccount(accountNumber, name, initialDeposit);
		} else {
			account = new BankingAccount(accountNumber, name);
		}
		
		System.out.println();
		System.out.println("Account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a deposit value: ");
		double depositValue = sc.nextDouble();
		account.deposit(depositValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		System.out.println();
		System.out.print("Enter a withdraw value: ");
		double withdrawValue = sc.nextDouble();
		account.withdraw(withdrawValue);
		System.out.println("Updated account data:");
		System.out.println(account);
		
		
		
		
		
		
		sc.close();
	}

}
