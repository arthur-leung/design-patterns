package command.simpleremote;

public class CeilingFan {
    enum Speed {HIGH, MEDIUM, LOW}

    ;
    String name;

    public CeilingFan(String name) {
        this.name = name;
    }

    Speed speed;

    public void high() {
        speed = Speed.HIGH;
        System.out.println("set speed: " + getSpeed());
    }

    public void medium() {
        speed = Speed.MEDIUM;
        System.out.println("set speed: " + getSpeed());
    }

    public void low() {
        speed = Speed.LOW;
        System.out.println("set speed: " + getSpeed());
    }

    public void off() {
        System.out.println("ceiling fan close");
        speed = null;
    }

    public String getSpeed() {
        return speed.name();
    }
}
