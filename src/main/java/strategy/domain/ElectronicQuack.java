package strategy.domain;

public class ElectronicQuack extends DuckCall {

    public ElectronicQuack() {
        quackBehavior = new Quack();
    }

    @Override
    public void model() {
        System.out.println("Electronic quack power 2000");
    }
}
