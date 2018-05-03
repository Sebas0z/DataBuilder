package com.co.ceiba.entity;

import java.util.ArrayList;
import java.util.List;

public class Account {

	private String number;
	private int balance;
	private List<Transaction> transactions;
	public int HHo = 0;

	public Account(String number, int balanceInicial) {
		this.number = number;
		this.balance = balanceInicial;
		transactions = new ArrayList<>();
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}

	public List<Transaction> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<Transaction> transactions) {
		this.transactions = transactions;
	}

}
