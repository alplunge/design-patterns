package decorator;

import decorator.components.Beverage;
import decorator.components.DarkRoast;
import decorator.decorators.Mocha;
import decorator.decorators.Soy;
import decorator.decorators.Whip;

public class StarbuzzCofee {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        darkRoast = new Mocha(darkRoast);
        darkRoast = new Soy(darkRoast);
        darkRoast = new Whip(darkRoast);

        System.out.println(darkRoast.getDescription());
        System.out.println(darkRoast.cost());
    }
}
