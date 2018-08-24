package ejercicio_en_clase;

public abstract class Account {

	protected long balance;

	private long transactionHistorySum;

	public Account() {
		this(0);
	}

	public Account(long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	protected void logTransaction(long amount) {
		transactionHistorySum += amount;
	}

	public long getTransactionHistorySum() {

		return transactionHistorySum;
	}

	public long depositFunds(long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid fund addition.");
		}
		logTransaction(amount);
		return balance += amount;
	}

	public int getPoints() {
		return (int) transactionHistorySum / 5;
	}

	public abstract long withdrawFunds(long amount);
}
