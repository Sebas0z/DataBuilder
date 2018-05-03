package com.co.ceiba.builder;

import java.util.Date;

import com.co.ceiba.entity.Transaction;

public class TransactionBuilder {

	private int amount;
	private String type;
	private Date date;

	public TransactionBuilder() {
		amount = 10;
		type = "Credito";
		date = new Date();
	}

	public TransactionBuilder withAmount(int amount) {
		this.amount = amount;
		return this;
	}

	public TransactionBuilder withType(String type) {
		this.type = type;
		return this;
	}

	public TransactionBuilder withDate(Date date) {
		this.date = date;
		return this;
	}

	public Transaction build() {
		return new Transaction(amount, type, date);
	}

	public static TransactionBuilder aTransaction() {
		return new TransactionBuilder();
	}

}
