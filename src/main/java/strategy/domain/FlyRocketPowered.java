package strategy.domain;

import strategy.Interfaces.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flying with the rocket");
    }
}
