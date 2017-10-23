package com.ap.designPatternsPractice.ChainOfResponsibility.atm.moneyDespenser;

/**
 * Created by apandey on 26-04-2017.
 */
public class Rupee100Despenser implements DispenserChain {
	private DispenserChain chain;

	@Override
	public void setNextChain(DispenserChain nextChain) {
		this.chain=nextChain;
	}

	@Override
	public void dispense(Currency cur) {
		if(cur.getAmount() >= 100){
			int num = cur.getAmount()/100;
			int remainder = cur.getAmount() % 100;
			System.out.println("Dispensing "+num+" 50$ note");
			if(remainder !=0) this.chain.dispense(new Currency(remainder));
		}else{
			this.chain.dispense(cur);
		}
	}
}
