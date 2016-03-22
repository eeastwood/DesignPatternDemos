package com.strategy.ed;

/*
* 
* 
*Code based off TutorialsPoint Design pattern tutorials
*
*
*/

public class StrategyDemo {
	public static void main(String[] args) {
	      Context context = new Context(new Add());		
	      System.out.println("10 + 5 = " + context.execute(10, 5));

	      context = new Context(new Subtract());		
	      System.out.println("10 - 5 = " + context.execute(10, 5));

	      context = new Context(new Multiply());		
	      System.out.println("10 * 5 = " + context.execute(10, 5));
	   }
	}