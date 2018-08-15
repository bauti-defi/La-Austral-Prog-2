package guia_2.ejercicio_1;

public class BankAccount {

	private final int id;
	private long balance;

	public BankAccount(int id, final long balance) {
		this.id = id;
		this.balance = balance;
	}

	public BankAccount(int id) {
		this(id, 0);
	}

	public long deposit(long depositAmount) {
		if (depositAmount <= 0) {
			throw new IllegalArgumentException("Can't deposit negative or 0 amount");
		}
		balance += depositAmount;
		return getBalance();
	}

	public long withdraw(long requestedAmount) {
		if (requestedAmount <= 0) {
			throw new IllegalArgumentException("Can't withdraw negative or 0 amount");
		} else if (requestedAmount > balance) {
			throw new IllegalArgumentException("Insufficient funds.");
		}
		balance -= requestedAmount;
		return requestedAmount;
	}

	public int getId() {
		return id;
	}

	public long getBalance() {
		return balance;
	}
}
