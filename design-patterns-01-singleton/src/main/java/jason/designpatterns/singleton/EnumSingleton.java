package jason.designpatterns.singleton;

/**
 * 枚举单例
 *
 * @author Jason Hou
 */
public enum EnumSingleton {

    /**
     * 枚举类型本身就是单例的
     */
    INSTANCE;

    /**
     * 向外提供一个静态的公有函数用于获取单实例
     */
    public static EnumSingleton getInstance() {
        return INSTANCE;
    }
}
