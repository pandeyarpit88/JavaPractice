package com.ap.designPatternsPractice.ChainOfResponsibility.atm.moneyDespenser;

/**
 * Created by apandey on 26-04-2017.
 */
public class Rupee2000Despenser implements DispenserChain {
	private DispenserChain chain;

	@Override
	public void setNextChain(DispenserChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 2000){
			int num = cur.getAmount()/2000;
			int remainder = cur.getAmount() % 2000;
			System.out.println("Dispensing "+num+" 2000Rs. note");
			if(remainder !=0) this.chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
	}
}
