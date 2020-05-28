package jason.designpatterns.singleton;

/**
 * 饿汉式
 *
 * @author Jason Hou
 */
public class HungrySingleton {

    /**
     * 类自身必须定义一个静态私有实例
     * 在类创建的同时就已经创建好一个静态的对象供系统使用
     */
    private static final HungrySingleton INSTANCE = new HungrySingleton();

    /**
     * 构造器私有化，避免在外部被实例化
     */
    private HungrySingleton() {
    }

    /**
     * 向外提供一个静态的公有函数用于获取单实例
     */
    public static HungrySingleton getInstance() {
        return INSTANCE;
    }
}
