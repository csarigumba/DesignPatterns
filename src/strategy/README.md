## Overview

The Strategy pattern defines a family of algorithms, encapsulates each one, and make them interchangeable. 
Strategy lets the algorithm vary independently from clients that use it.

# Strategy Design Pattern - Duck Example

The Strategy design pattern allows for dynamic selection and interchangeability of behaviors at runtime. In this example, we have a `Duck` class that serves as the superclass for different types of ducks. The `Duck` class uses composition to encapsulate fly and quack behaviors through the `FlyBehavior` and `QuackBehavior` interfaces.

A specific type of duck, `MallardDuck`, extends the `Duck` class and sets its initial fly and quack behaviors. The `StrategyPatternMain` class demonstrates how behaviors can be easily changed and executed.

## Code Snippet

```java
// Duck class
public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    
    public void performFly() {
        flyBehavior.fly();
    }
    
    public void performQuack() {
        quackBehavior.quack();
    }
    
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
    
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }
    
    public abstract void display();
}

// MallardDuck class
public class MallardDuck extends Duck {
    public MallardDuck() {
        flyBehavior = new FlyWithWings();
        quackBehavior = new Quack();
    }
    
    public void display() {
        System.out.println("I am a Mallard duck!");
    }
}

// FlyBehavior interface
public interface FlyBehavior {
    void fly();
}

// QuackBehavior interface
public interface QuackBehavior {
    void quack();
}

// ...

// Usage example
public class StrategyPatternMain {
    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performFly();
        mallard.performQuack();
        
        // Change behaviors at runtime
        mallard.setFlyBehavior(new FlyNoWay());
        mallard.setQuackBehavior(new Squeak());
        mallard.performFly();
        mallard.performQuack();
    }
}
```

## Benefits of the Strategy Design Pattern

- **Flexibility**: Behaviors can be selected and changed dynamically.
- **Reusability**: Behaviors can be reused across different classes.
- **Maintainability**: Adding or modifying behaviors doesn't require changing core classes.
- **Encapsulation**: Each behavior is encapsulated within its own class.
- **Testability**: Behaviors can be easily tested in isolation.

The Strategy pattern provides a clean and extensible solution for managing behavior variations without complex conditional statements or inheritance hierarchies.