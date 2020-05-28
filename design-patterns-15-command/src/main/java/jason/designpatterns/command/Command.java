package jason.designpatterns.command;

/**
 * 命令接口
 * 抽象命令类，声明执行命令的接口，拥有执行命令的抽象方法 execute()
 *
 * @author Jason Hou
 */
public interface Command {

    /**
     * 执行命令
     *
     * @return 结果
     */
    String execute();

}