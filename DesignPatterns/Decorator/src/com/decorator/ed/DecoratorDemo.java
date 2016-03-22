package com.decorator.ed;
/*
* 
* 
*Code based off TutorialsPoint Design pattern tutorials
*
*
*/
public class DecoratorDemo {
	  public static void main(String[] args) {

	      Shape circle = new Circle();

	      Shape redCircle = new RedDecorator(new Circle());

	      Shape redRectangle = new RedDecorator(new Rectangle());
	      System.out.println("Circle with normal border");
	      circle.draw();

	      System.out.println("\nCircle of red border");
	      redCircle.draw();

	      System.out.println("\nRectangle of red border");
	      redRectangle.draw();
	   }
}
