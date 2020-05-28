package jason.designpatterns.iterator;

/**
 * 抽象迭代器角色：定义访问和遍历聚合元素的接口
 *
 * @author Jason Hou
 */
public interface Iterator {

    /**
     * 是否有下一个元素
     *
     * @return 有则true
     */
    boolean hasNext();

    /**
     * 返回下一个元素
     *
     * @return 下一个元素
     */
    Object next();

}
