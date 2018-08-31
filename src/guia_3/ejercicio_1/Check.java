package guia_3.ejercicio_1;

import java.util.Date;

public class Check {

	private final long senderId, recipientId;
	private final long amount;
	private final Date date;

	public Check(final long senderId, final long recipientId, final long amount) {
		this.senderId = senderId;
		this.recipientId = recipientId;
		if (amount <= 0) {
			throw new IllegalArgumentException("Invalid check amount");
		}
		this.amount = amount;
		this.date = new Date();
	}

	public long getSenderId() {
		return senderId;
	}

	public long getRecipientId() {
		return recipientId;
	}

	public long getAmount() {
		return amount;
	}

	public Date getDate() {
		return date;
	}
}
