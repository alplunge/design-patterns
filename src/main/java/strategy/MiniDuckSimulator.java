package strategy;

import strategy.domain.*;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.setFlyBehavior(new FlyRocketPowered());
        modelDuck.performFly();
        modelDuck.performQuack();

        DuckCall electronicCall = new ElectronicQuack();
        electronicCall.model();
        electronicCall.performQuack();
    }
}
