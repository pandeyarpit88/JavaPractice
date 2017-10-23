package com.ap.designPatternsPractice.ChainOfResponsibility.atm.moneyDespenser;

/**
 * Created by apandey on 26-04-2017.
 */
public class Currency {
	private int amount;

	public Currency(int amt){
		this.amount=amt;
	}

	public int getAmount(){
		return this.amount;
	}
}
