package command_patterns;

/**
 * Created by yang on 2019/4/14.
 */
public interface Command {

    /**
     * 执行命令
     */
    void execute();

    /**
     * 回撤命令
     */
    void undo();
}
