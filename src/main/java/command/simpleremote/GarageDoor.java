package command.simpleremote;

public class GarageDoor {
    String name;

    public GarageDoor(String name) {
        this.name = name;
    }

    public void up() {
        System.out.println("door is open");
    }

    public void down() {
        System.out.println("door is close");
    }

    public void stop() {
        System.out.println("door stop");
    }

    public void lightON() {
        System.out.println("door light on");
    }

    public void lightOff() {
        System.out.println("door light off");
    }
}
