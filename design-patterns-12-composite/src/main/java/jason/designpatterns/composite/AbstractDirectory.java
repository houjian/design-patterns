package jason.designpatterns.composite;

import java.util.LinkedList;
import java.util.List;

/**
 * 目录
 * 抽象构件，声明访问和管理子类的接口
 *
 * @author Jason Hou
 */
public abstract class AbstractDirectory {

    private final String name;

    private final List<AbstractDirectory> children = new LinkedList<>();

    protected AbstractDirectory(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void add(AbstractDirectory d) {
        children.add(d);
    }

    public boolean remove(AbstractDirectory d) {
        return children.remove(d);
    }

    public AbstractDirectory getChild(int index) {
        return children.get(index);
    }

    public int size() {
        return children.size();
    }

    /**
     * 显示目录信息
     *
     * @return 信息
     */
    public abstract String show();

}
