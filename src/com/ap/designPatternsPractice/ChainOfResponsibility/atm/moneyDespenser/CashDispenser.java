package com.ap.designPatternsPractice.ChainOfResponsibility.atm.moneyDespenser;

/**
 * Created by apandey on 26-04-2017.
 */

//Follow Chain of Responsibility
public interface CashDispenser {
	void despenseCash();
	void isSufficientBalanceAvailable();
}
