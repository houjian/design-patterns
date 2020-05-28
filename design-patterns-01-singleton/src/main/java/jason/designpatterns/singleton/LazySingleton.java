package jason.designpatterns.singleton;

/**
 * 懒汉式
 *
 * @author Jason Hou
 */
public class LazySingleton {

    /**
     * 类自身必须定义一个静态私有实例
     * 使用 volatile 保证 instance 对所有线程的可见性
     */
    private static volatile LazySingleton instance;

    /**
     * 构造器私有化，避免在外部被实例化
     */
    private LazySingleton() {
    }

    /**
     * 向外提供一个静态的公有函数用于获取单实例
     * 该模式的特点是类加载时没有生成单例，只有当第一次调用 getInstance 方法时才去创建这个单例
     * 使用 synchronized 避免多线程同时实例化
     */
    public static synchronized LazySingleton getInstance() {
        if (instance == null) {
            instance = new LazySingleton();
        }
        return instance;
    }
}
