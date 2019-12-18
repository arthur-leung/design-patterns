package command.simpleremote;

public class StereoOpenCommand implements Command {
    Stereo stereo;

    public StereoOpenCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.on();
        stereo.setCd();
        stereo.setVolume(12);
    }
}
