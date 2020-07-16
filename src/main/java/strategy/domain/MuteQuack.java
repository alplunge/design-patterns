package strategy.domain;

import strategy.Interfaces.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("<<Dead silence>>");
    }
}
