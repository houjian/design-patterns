package jason.designpatterns.prototype;

/**
 * 原型模式
 *
 * @author Jason Hou
 */
public class Realizetype implements Cloneable {

    /**
     * 通过克隆该原型对象来创建一个和原型相同或相似的新对象
     */
    @Override
    public Realizetype clone() {
        try {
            return (Realizetype) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

}
