package command_patterns;

/**
 * Created by yang on 2019/4/14.
 */
public class SimpleRemoteControl {


    Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void buttonWasPressed() {
        command.execute();
    }

    public void buttonUndo() {
        command.undo();
    }
}
