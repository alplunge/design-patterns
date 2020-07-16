package strategy.domain;

import strategy.Interfaces.QuackBehavior;

public abstract class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
    }

    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void performQuack() {
        quackBehavior.quack();
    }

    public abstract void model();
}
