package com.co.ceiba.test;

import static com.co.ceiba.builder.AccountBuilder.anAccount;
import static com.co.ceiba.builder.TransactionBuilder.aTransaction;

import org.junit.Test;

import com.co.ceiba.entity.Account;

public class AccountManagerSpec {

	@Test
	public void deberiaTransferirEntreDosCuentas() {
		Account account1 = new Account("12345", 100);
		Account account2 = new Account("54321", 200);
	}

	@Test
	public void itShouldTransferBetweenTwoAccounts() {
		Account account1 = anAccount().withBalance(100).build();
		Account account2 = anAccount().withBalance(200).build();
		Account account3 = anAccount().withNumber("159753").withBalance(300).build();
	}

	@Test
	public void itShouldTransfer() {
		Account account1 = anAccount().withNumber("123").withBalance(50)
				.with(aTransaction().withType("Credito").withAmount(200),
						aTransaction().withType("Credito").withAmount(100),
						aTransaction().withType("Debito").withAmount(80))
				.build();
	}

}
