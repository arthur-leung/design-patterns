package command.simpleremote;

public class CeilingFanCloseCommand implements Command{
    CeilingFan ceilingFan;

    public CeilingFanCloseCommand(CeilingFan ceilingFan) {
        this.ceilingFan = ceilingFan;
    }
    
    @Override
    public void execute() {
        ceilingFan.off();
    }
}
