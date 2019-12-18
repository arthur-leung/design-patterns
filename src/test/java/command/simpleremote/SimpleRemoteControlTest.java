package command.simpleremote;

import org.junit.Test;

public class SimpleRemoteControlTest {
    @Test
    public void testSimpleRemoteControl() {
        RemoteControl remoteControl = new RemoteControl();

        Light livingRoomLight = new Light("Living Room");
        Light kitchenLight = new Light("Kitchen");
        CeilingFan ceilingFan = new CeilingFan("Living Room");
        GarageDoor garageDoor = new GarageDoor("");
        Stereo stereo = new Stereo("Living Room");

        LightOnCommand livingRoomLightOn =                new LightOnCommand(livingRoomLight);
        LightOffCommand livingRoomLightOff =                new LightOffCommand(livingRoomLight);
        LightOnCommand kitchenLightOn =                new LightOnCommand(kitchenLight);
        LightOffCommand kitchenLightOff = new LightOffCommand(kitchenLight);

        CeilingFanOpenCommand ceilingFanOpenCommand = new CeilingFanOpenCommand(ceilingFan);
        CeilingFanCloseCommand ceilingFanCloseCommand = new CeilingFanCloseCommand(ceilingFan);

        GarageDoorOpenCommand garageDoorOpenCommand = new GarageDoorOpenCommand(garageDoor);
        GarageDoorCloseCommand garageDoorCloseCommand = new GarageDoorCloseCommand(garageDoor);

        StereoOpenCommand stereoOpenCommand = new StereoOpenCommand(stereo);
        StereoCloseCommand stereoCloseCommand = new StereoCloseCommand(stereo);

        remoteControl.setCommand(0, livingRoomLightOn, livingRoomLightOff);
        remoteControl.setCommand(1, kitchenLightOn, kitchenLightOff);
        remoteControl.setCommand(2, ceilingFanOpenCommand, ceilingFanCloseCommand);
        remoteControl.setCommand(3, stereoOpenCommand, stereoCloseCommand);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPressed(0);
        remoteControl.offButtonWasPressed(0);
        remoteControl.onButtonWasPressed(1);
        remoteControl.offButtonWasPressed(1);
        remoteControl.onButtonWasPressed(2);
        remoteControl.offButtonWasPressed(2);
        remoteControl.onButtonWasPressed(3);
        remoteControl.offButtonWasPressed(3);
    }
}