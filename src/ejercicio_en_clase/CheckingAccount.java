package ejercicio_en_clase;

public class CheckingAccount extends Account {


	@Override
	public long withdrawFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Can't withdraw negative/0 amount");
		} else if (getBalance() - amount <= -80) {
			throw new RuntimeException("Insufficient funds.");
		}
		logTransaction(amount);
		balance -= amount;
		return amount;
	}
}
