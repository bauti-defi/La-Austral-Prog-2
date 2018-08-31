package guia_3.ejercicio_1;

public class CheckingAccount extends Account {

	private final long MONTHLY_FEE = 100;

	private final long descubierto;

	private final long maxDescubiertoAllowed;

	private long maxDescubiertoReached;

	public CheckingAccount(final long id, final long descubierto, final long maxDescubiertoAllowed) {
		super(id);
		this.descubierto = descubierto;
		this.maxDescubiertoAllowed = maxDescubiertoAllowed;
	}

	public CheckingAccount(final long id, final long balance, final long descubierto, final long maxDescubiertoAllowed) {
		super(id, balance);
		this.descubierto = descubierto;
		this.maxDescubiertoAllowed = maxDescubiertoAllowed;
	}

	public long getDescubierto() {
		return descubierto;
	}

	public long getMaxDescubiertoAllowed() {
		return maxDescubiertoAllowed;
	}

	public long getMaxDescubiertoReached() {
		return maxDescubiertoReached;
	}

	@Override
	public void depositFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid deposit amount");
		} else if (getBalance() < 0) {
			if (addToBalance(amount) > 0) {
				subtractFromBalance((long) (maxDescubiertoReached * .01));
			}
		} else {
			addToBalance(amount);
		}
	}

	public Check writeCheck(long recipientId, long amount) {
		return new Check(getId(), recipientId, withdrawFunds(amount));
	}

	@Override
	public long withdrawFunds(final long amount) {
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid withdraw amount");
		} else if (getBalance() - amount < maxDescubiertoAllowed) {
			throw new RuntimeException("Too much for your descubierto");
		} else if (subtractFromBalance(amount) < maxDescubiertoReached) {
			maxDescubiertoReached = getBalance();
		}
		return amount;
	}

	public void chargeMonthlyFee() {
		subtractFromBalance(MONTHLY_FEE);
	}
}
