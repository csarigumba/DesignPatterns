package strategy.implementation;

import strategy.interfaces.QuackBehavior;

public class Quack implements QuackBehavior {

	@Override
	public void quack() {
		System.out.println("Quack!!");

	}

}
