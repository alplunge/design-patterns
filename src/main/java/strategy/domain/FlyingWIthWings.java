package strategy.domain;

import strategy.Interfaces.FlyBehavior;

public class FlyingWIthWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("I can fly");
    }
}
