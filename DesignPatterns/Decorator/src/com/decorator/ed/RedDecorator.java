package com.decorator.ed;

public class RedDecorator extends ShapeDecorator{
	
	public RedDecorator (Shape decoratedShape){
		super(decoratedShape);
	}
	
	@Override
	public void draw(){
		decoratedShape.draw();
		setRed(decoratedShape);
	}
	
	private void setRed (Shape decoratedShape){
		System.out.println("Color: Red");
	}
	
}
