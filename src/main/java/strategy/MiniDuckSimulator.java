package strategy;

public class MiniDuckSimulator {
    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        mallardDuck.performQuack();

        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        FlyWithRockedPowered flyWithRockedPowered = new FlyWithRockedPowered();
        modelDuck.setFlyBehavior(flyWithRockedPowered);
        modelDuck.performFly();
    }
}
