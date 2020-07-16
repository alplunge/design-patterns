package factory;

public class PizzaOrder {
    public static void main(String[] args) {
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan ordered pizza :" +pizza.getName());

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Joel ordered pizza :"+pizza.getName());
    }
}
