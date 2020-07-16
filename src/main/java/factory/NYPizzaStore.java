package factory;

public class NYPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        if (type.equals("peperoni")) {
            return new NYPepperoniPizza();
        } else if (type.equals("cheese")) {
            return new NYCheesePizza();
        } else {
            return null;
        }
    }
}
