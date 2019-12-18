package command.simpleremote;

public class Stereo {
    String name;

    public Stereo(String name) {
        this.name = name;
    }

    public void on() {
        System.out.println("stereo on");
    }

    public void off() {
        System.out.println("stereo close");
    }

    public void setCd() {
        System.out.println("stereo set cd");
    }

    public void setDvd() {
        System.out.println("stereo set Dvd");
    }

    public void setRadio() {
        System.out.println("stereo set Radio");
    }

    public void setVolume(int volume) {
        System.out.println("stereo set volume: " + volume);
    }
}
