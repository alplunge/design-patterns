package decorator.decorators;

import decorator.components.Beverage;

public abstract class CondimentDecorator extends Beverage {
    public abstract String getDescription();
}
