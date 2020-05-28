package jason.designpatterns.command;

/**
 * 停止命令
 * 具体命令角色
 *
 * @author Jason Hou
 */
public class StopCommand implements Command {

    /**
     * 拥有接收者对象
     */
    private final AudioPlayer audioPlayer;

    public StopCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public String execute() {
        return audioPlayer.stop();
    }

}
