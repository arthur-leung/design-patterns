package factory.pizza;

public class PizzaFactory {
    static Pizza pizza = null;

    public static Pizza createPizza(String type) {
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("greek")) {
            pizza = new GreekPizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        }

        return pizza;
    }
}
