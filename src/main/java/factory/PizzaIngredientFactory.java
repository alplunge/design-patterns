package factory;

import factory.ingredients.*;

public interface PizzaIngredientFactory {
    Dough createDough();

    Sauce createSauce();

    Cheese createCheese();

    Veggi[] createVeggies();

    Pepperoni createPepperoni();

    Clam createClams();
}
