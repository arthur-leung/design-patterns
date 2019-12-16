package factory.pizza;

public abstract class Pizza {
    String name;

    public String getName() {
        return name;
    }

    void prepare() {
        System.out.println("prepare " + name);
    }

    void bake() {
        System.out.println("bake " + name);
    }

    void cut() {
        System.out.println("cut" + name);
    }

    void box() {
        System.out.println("box" + name);
    }
}
