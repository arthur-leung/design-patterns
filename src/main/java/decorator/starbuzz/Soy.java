package decorator.starbuzz;

public class Soy extends CondimentDecorator {
    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ", Soy";
    }

    public double cost() {
        double cost = beverage.cost();
        switch (beverage.getSize()) {
            case TALL:
                cost += .1;
                break;
            case GRANDE:
                cost += .15;
                break;
            case VENTI:
                cost += .2;
                break;
        }
        return cost;
    }
}
