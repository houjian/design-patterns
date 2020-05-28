package jason.designpatterns.iterator;

import java.util.List;

/**
 * 具体迭代器，完成对聚合对象的遍历
 *
 * @author Jason Hou
 */
public class ConcreteIterator implements Iterator {

    private final List<Object> objectList;
    /**
     * 记录遍历的当前位置
     */
    private int index = -1;

    public ConcreteIterator(List<Object> objectList) {
        this.objectList = objectList;
    }

    @Override
    public boolean hasNext() {
        return index < objectList.size() - 1;
    }

    @Override
    public Object next() {
        return objectList.get(++index);
    }

}
