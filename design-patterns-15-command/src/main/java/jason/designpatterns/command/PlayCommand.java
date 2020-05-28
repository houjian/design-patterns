package jason.designpatterns.command;

/**
 * 播放命令
 * 具体命令角色
 *
 * @author Jason Hou
 */
public class PlayCommand implements Command {

    /**
     * 拥有接收者对象
     */
    private final AudioPlayer audioPlayer;

    public PlayCommand(AudioPlayer audioPlayer) {
        this.audioPlayer = audioPlayer;
    }

    @Override
    public String execute() {
        return audioPlayer.play();
    }

}
