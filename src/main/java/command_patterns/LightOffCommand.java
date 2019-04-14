package command_patterns;

/**
 * Created by yang on 2019/4/14.
 */
public class LightOffCommand implements Command {

    Light light;


    public LightOffCommand(Light light) {
        this.light = light;
    }

    public void execute() {
        this.light.off();

    }

    public void undo() {
        this.light.on();
    }
}
