package strategy;

import strategy.implementation.FlyNoWay;
import strategy.implementation.Quack;

public class ModelDuck extends Duck {
	
	ModelDuck() {
		flyBehavior = new FlyNoWay();
		quackBehavior = new Quack();
	}
	

	@Override
	public void display() {
		System.out.println("I am a Model duck!");

	}
	
}
