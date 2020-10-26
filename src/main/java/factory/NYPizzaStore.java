package factory;

public class NYPizzaStore extends PizzaStore {

    @Override
    public Pizza createPizza(String type) {
        Pizza pizza;
        PizzaIngredientFactory pizzaIngredientFactory = new NYPizzaIngredientFactory();
        if (type.equals("peperoni")) {
            pizza = new PepperoniPizza(pizzaIngredientFactory);
            pizza.setName("Ny Style pepperoni pizza");
        } else if (type.equals("cheese")) {
            pizza = new CheesePizza(pizzaIngredientFactory);
            pizza.setName("NY style cheese pizza");
        } else {
            pizza = null;
        }
        return pizza;
    }
}
