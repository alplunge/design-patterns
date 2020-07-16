package strategy.domain;

public class MallardDuck extends Duck {

    public MallardDuck() {
        quackBehavior = new Quack();
        flyBehavior = new FlyingWIthWings();
    }

    @Override
    public void display() {
        System.out.println("I am mallard duck");
    }
}
