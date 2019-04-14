package command_patterns;

/**
 * 遥控器
 * Created by yang on 2019/4/14.
 */
public class RemoteControl {

    private Command[] onCmd;

    private Command[] offCmd;

    private Command lastCmd;

    public RemoteControl() {
        onCmd = new Command[2];
        offCmd = new Command[2];

        Command noCmd = new NoCommand();
        lastCmd = noCmd;
        //让所有的预先设置成nocmd
        for (int i = 0; i < 2; i++) {
            onCmd[i] = noCmd;
            offCmd[i] = noCmd;
        }
    }

    public void setCommand(int solt, Command onCmd, Command offCmd) {
        this.onCmd[solt] = onCmd;
        this.offCmd[solt] = offCmd;
    }

    public void onButtonWasPress(int solt) {
        Command command = this.onCmd[solt];
        command.execute();
        lastCmd = command;

    }

    public void offButtonWasPress(int solt) {
        Command command = this.offCmd[solt];
        command.execute();
        lastCmd = command;
    }

    /**
     * 撤销
     */
    public void undoButton() {
        lastCmd.undo();
    }
}
