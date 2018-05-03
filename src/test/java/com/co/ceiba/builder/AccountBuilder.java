package com.co.ceiba.builder;

import java.util.ArrayList;
import java.util.List;

import com.co.ceiba.entity.Account;
import com.co.ceiba.entity.Transaction;

public class AccountBuilder {

	private String number;
	private int balance;
	private List<Transaction> transactions;

	public AccountBuilder() {
		number = "12345";
		balance = 0;
	}

	public AccountBuilder withNumber(String number) {
		this.number = number;
		return this;
	}

	public AccountBuilder withBalance(int balance) {
		this.balance = balance;
		return this;
	}

	public AccountBuilder with(TransactionBuilder... transactionBuilders) {
		transactions = new ArrayList<>();

		for (TransactionBuilder transactionBuilder : transactionBuilders) {
			transactions.add(transactionBuilder.build());
		}

		return this;
	}

	public Account build() {
		return new Account(number, balance);
	}

	public static AccountBuilder anAccount() {
		return new AccountBuilder();
	}

}
