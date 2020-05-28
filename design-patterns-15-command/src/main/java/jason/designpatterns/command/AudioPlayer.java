package jason.designpatterns.command;

/**
 * 播放器
 * 命令接收者
 *
 * @author Jason Hou
 */
public class AudioPlayer {

    public String play() {
        return "播放";
    }

    public String stop() {
        return "停止";
    }

}
