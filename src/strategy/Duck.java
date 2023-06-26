package strategy;

import strategy.interfaces.FlyBehavior;
import strategy.interfaces.QuackBehavior;

public abstract class Duck {
	
	// Each duck has a different fly behavior so we will separate it into an interface and just inject
	// during runtime. Same with quackbehavior.
	FlyBehavior flyBehavior;
	QuackBehavior quackBehavior;
	
	public Duck() {
		
	}
	
	public abstract void display();
	
	public void performFly (){
		this.flyBehavior.fly();
	}
	
	public void performQuack(){
		this.quackBehavior.quack();
	}
	
	public void swim() {
		System.out.println("All ducks float, even decoys!");
	}
	
	public void setFlyBehavior(FlyBehavior fb) {
		flyBehavior = fb;
	}
	
	public void setQuackBehavior(QuackBehavior qb) {
		quackBehavior = qb;
	}
}
