package ejercicio_en_clase;

public class SavingAccount extends Account {


	@Override
	public long withdrawFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Can't withdraw negative/0 amount");
		} else if (getBalance() - amount <= 0) {
			throw new RuntimeException("Insufficient Funds");
		}
		logTransaction(amount);
		balance -= amount;
		return 0;
	}
}
