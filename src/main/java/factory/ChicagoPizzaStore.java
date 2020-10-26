package factory;

public class ChicagoPizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new ChicagoPizzaIngredientFactory();
        if (type.equals("peperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Chicago style pepperoni pizza");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("Chicago style cheese pizza");
        } else {
            pizza = null;
        }
        return pizza;
    }
}
