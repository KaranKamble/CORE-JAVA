package test;

import java.util.Objects;

public class Account implements Comparable<Account> {
	private int number;
	private String type;
	private float amount;

	public Account() {
		this(0, " ", 0);
	}

	public Account(int number, String type, float amount) {
		this.number = number;
		this.type = type;
		this.amount = amount;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public float getAmount() {
		return amount;
	}

	public void setAmount(float amount) {
		this.amount = amount;
	}

	@Override
	public int hashCode() {
		return Objects.hash(number);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Account other = (Account) obj;
		return number == other.number;
	}

	@Override
	public int compareTo(Account other) {
		return this.number - other.number;
	}

	@Override
	public String toString() {
		return String.format("%-10d%-13s%-13.2f", this.number, this.type, this.amount);
	}

}
