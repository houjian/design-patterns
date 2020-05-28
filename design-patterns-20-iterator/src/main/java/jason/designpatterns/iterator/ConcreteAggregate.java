package jason.designpatterns.iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体聚合角色，实现抽象聚合类，返回一个具体迭代器的实例
 *
 * @author Jason Hou
 */
public class ConcreteAggregate implements Aggregate {

    private final List<Object> objectList;

    public ConcreteAggregate() {
        this.objectList = new ArrayList<>();
    }

    @Override
    public boolean add(Object o) {
        return objectList.add(o);
    }

    @Override
    public boolean remove(Object o) {
        return objectList.remove(o);
    }

    @Override
    public Iterator iterator() {
        return new ConcreteIterator(objectList);
    }

}
