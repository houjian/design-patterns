package jason.designpatterns.visitor;

import jason.designpatterns.visitor.element.Element;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构
 * 是一个包含元素角色的容器，提供让访问者对象遍历容器中的所有元素的方法
 *
 * @author Jason Hou
 */
public class ObjectStructure {

    private final List<Element> list = new ArrayList<>();

    public void attach(Element element) {
        list.add(element);
    }

    public void detach(Element element) {
        list.remove(element);
    }

    public void accept(Visitor visitor) {
        for (Element element : list) {
            element.accept(visitor);
        }
    }

}
