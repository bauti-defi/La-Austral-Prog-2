package guia_2.ejercicio_1;

import java.util.HashMap;

public class Bank {

	private static final HashMap<Integer, BankAccount> accounts = new HashMap<>();

	public static final void main(String[] args) {
		final BankAccount tester1 = new BankAccount(0, 1000);
		final BankAccount tester2 = new BankAccount(1, 1000);
		addBankAccount(tester1);
		addBankAccount(tester2);
		System.out.println("Transfer: " + transferMoney(tester1.getId(), tester2.getId(), 100));
		System.out.println("Tester 2 Balance: " + tester2.getBalance());
	}

	public static void addBankAccount(BankAccount bankAccount) {
		accounts.put(bankAccount.getId(), bankAccount);
	}

	/*
	Returns amount successfully transferred
	 */
	public static long transferMoney(int senderId, int recipientId, long transferAmount) {
		final BankAccount senderAccount;
		if ((senderAccount = accounts.get(senderId)) != null) {
			final BankAccount recipientAccount;
			if ((recipientAccount = accounts.get(recipientId)) != null) {
				return recipientAccount.deposit(senderAccount.withdraw(transferAmount));
			}
			throw new NullPointerException("Invalid recipient account id");
		}
		throw new NullPointerException("Invalid sender account id");
	}


}
