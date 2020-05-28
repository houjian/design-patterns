package jason.designpatterns.visitor.element;

import jason.designpatterns.visitor.Visitor;

/**
 * 抽象元素
 *
 * @author Jason Hou
 */
public interface Element {

    /**
     * 接收访问者
     *
     * @param visitor 访问者
     */
    void accept(Visitor visitor);

}
