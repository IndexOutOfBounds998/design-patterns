package command_patterns;

/**
 * Created by yang on 2019/4/14.
 */
public class App {
    public static void main(String[] args) {
        System.out.println("simple remote control==================");
        SimpleRemoteControl simpleRemoteControl = new SimpleRemoteControl();
        Light light = new Light();
        Command lightOnCommand = new LightOnCommand(light);
        simpleRemoteControl.setCommand(lightOnCommand);
        simpleRemoteControl.buttonWasPressed();
        simpleRemoteControl.buttonUndo();
        System.out.println("remote control==================");
        LightOffCommand lightOffCommand = new LightOffCommand(light);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.setCommand(0, lightOnCommand, lightOffCommand);
        remoteControl.onButtonWasPress(0);
        remoteControl.offButtonWasPress(0);
        remoteControl.undoButton();
    }
}
