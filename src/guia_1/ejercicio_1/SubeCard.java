package guia_1.ejercicio_1;

public class SubeCard {

	private long balance;

	public SubeCard() {

	}

	public SubeCard(final long balance) {
		this.balance = balance;
	}

	public long getBalance() {
		return balance;
	}

	public long deposit(long amountToDeposit) {
		if (amountToDeposit <= 0) {
			throw new IllegalArgumentException("Cannot deposit negative or 0 amount");
		}
		balance += amountToDeposit;
		return balance;
	}

	public long chargeForRide(long price) {
		if (price < 0) {
			throw new IllegalArgumentException("Price cannot be negative");
		} else if (price > balance) {
			throw new IllegalArgumentException("Insufficient funds.");
		}
		balance -= price;
		return balance;
	}
}
