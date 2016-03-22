package com.strategy.ed;

public class Add implements Strategy {

	@Override
	public int doOp(int num1, int num2) {
		
		return num1 + num2;
	}

}
