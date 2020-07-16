package factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("peperoni")) {
            return new PepperoniPizza();
        } else if (type.equals("cheese")) {
            return new CheesePizza();
        } else {
            return null;
        }
    }
}
