package jason.designpatterns.composite;

/**
 * 文件夹
 * 树枝构件，是组合中的分支节点对象，它有子节点
 *
 * @author Jason Hou
 */
public class Folder extends AbstractDirectory {

    public Folder(String name) {
        super(name);
    }

    @Override
    public String show() {
        return "目录" + getName();
    }

}
