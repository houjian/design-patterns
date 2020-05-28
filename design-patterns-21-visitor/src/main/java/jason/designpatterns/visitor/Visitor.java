package jason.designpatterns.visitor;

import jason.designpatterns.visitor.element.FirstElement;
import jason.designpatterns.visitor.element.SecondElement;

/**
 * 抽象访问者
 *
 * @author Jason Hou
 */
public interface Visitor {

    /**
     * 访问第一类元素
     *
     * @param element 元素
     */
    void visit(FirstElement element);

    /**
     * 访问第二类元素
     *
     * @param element 元素
     */
    void visit(SecondElement element);

}
