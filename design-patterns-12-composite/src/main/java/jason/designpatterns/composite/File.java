package jason.designpatterns.composite;

/**
 * 文件
 * 树叶构件，没有子节点
 *
 * @author Jason Hou
 */
public class File extends AbstractDirectory {

    public File(String name) {
        super(name);
    }

    @Override
    public String show() {
        return "文件" + getName();
    }

}
