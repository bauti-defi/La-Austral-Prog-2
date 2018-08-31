package guia_3.ejercicio_1;

public abstract class Account {

	private final long id;

	private long balance;

	public Account(long id) {
		this(id, 0);
	}

	public Account(long id, long balance) {
		this.id = id;
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	protected long addToBalance(long amount) {
		return balance += amount;
	}

	protected long subtractFromBalance(long amount) {
		return balance -= amount;
	}

	public long getId() {
		return id;
	}

	public abstract void depositFunds(long amount);

	public void depositCheck(final Check check) {
		if (check.getRecipientId() == getId()) {
			depositFunds(check.getAmount());
		}
	}

	public abstract long withdrawFunds(long amount);
}
