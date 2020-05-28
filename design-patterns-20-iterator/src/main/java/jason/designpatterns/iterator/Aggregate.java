package jason.designpatterns.iterator;

/**
 * 抽象聚合角色：定义添加、删除聚合对象以及创建迭代器对象的接口
 *
 * @author Jason Hou
 */
public interface Aggregate {

    /**
     * 添加
     *
     * @param o 元素
     * @return 结果
     */
    boolean add(Object o);

    /**
     * 删除
     *
     * @param o 元素
     * @return 结果
     */
    boolean remove(Object o);

    /**
     * 创建迭代器
     *
     * @return 迭代器
     */
    Iterator iterator();

}
