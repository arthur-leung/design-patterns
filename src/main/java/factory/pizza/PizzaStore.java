package factory.pizza;

public class PizzaStore {
    Pizza pizza;

    Pizza orderPizza(String type) {
        pizza = PizzaFactory.createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }
}
