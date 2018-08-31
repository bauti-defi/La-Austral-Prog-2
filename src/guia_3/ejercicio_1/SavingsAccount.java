package guia_3.ejercicio_1;

public class SavingsAccount extends Account {

	private final int monthlyTransactionLimit;

	private int monthTransactionCount;

	public SavingsAccount(final long id, final int monthlyTransactionLimit) {
		super(id);
		this.monthlyTransactionLimit = monthlyTransactionLimit;
	}

	public SavingsAccount(final long id, final long balance, final int monthlyTransactionLimit) {
		super(id, balance);
		this.monthlyTransactionLimit = monthlyTransactionLimit;
	}

	public int getMonthlyTransactionLimit() {
		return monthlyTransactionLimit;
	}

	public int getMonthTransactionCount() {
		return monthTransactionCount;
	}

	@Override
	public void depositFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount");
		}
		monthTransactionCount++;
		if (monthlyTransactionLimit <= monthTransactionCount) {
			addToBalance((long) (amount * 0.99));
		} else {
			addToBalance(amount);
		}
	}

	@Override
	public long withdrawFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdraw amount");
		} else if (getBalance() - amount < 0) {
			throw new RuntimeException("Insufficient funds");
		}
		subtractFromBalance(amount);
		monthTransactionCount++;
		if (monthlyTransactionLimit <= monthTransactionCount) {
			return (long) (amount * 0.99);
		}
		return amount;
	}
}
