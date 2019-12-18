package command.simpleremote;

public class CeilingFanOpenCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanOpenCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }

    @Override
    public void execute() {
        ceilingFan.medium();
    }
}
