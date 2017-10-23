package com.ap.designPatternsPractice.ChainOfResponsibility.atm.moneyDespenser;

/**
 * Created by apandey on 26-04-2017.
 */
public interface DispenserChain {
	void setNextChain(DispenserChain nextChain);

	void dispense(Currency cur);
}
