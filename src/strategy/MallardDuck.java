package strategy;

import strategy.implementation.FlyWithWings;
import strategy.implementation.Quack;

public class MallardDuck extends Duck {
	
	MallardDuck() {
		flyBehavior = new FlyWithWings();
		quackBehavior = new Quack();
	}
	

	@Override
	public void display() {
		System.out.println("I am a Mallard duck!");

	}
	
	public void myOwnMethod() {
		System.out.println("Only concrete implementation can access this!");
	}

}
