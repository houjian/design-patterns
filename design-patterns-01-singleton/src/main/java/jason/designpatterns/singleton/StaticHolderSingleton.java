package jason.designpatterns.singleton;

/**
 * 静态内部类单例
 *
 * @author Jason Hou
 */
public class StaticHolderSingleton {

    /**
     * 静态内部类持有外部类的一个实例
     */
    private static class Holder {
        /**
         * 静态内部类第一次被加载的时候才创建这个实例
         */
        private static final StaticHolderSingleton INSTANCE = new StaticHolderSingleton();
    }

    /**
     * 构造器私有化，避免在外部被实例化
     */
    private StaticHolderSingleton() {
    }

    /**
     * 向外提供一个静态的公有函数用于获取单实例
     */
    public static StaticHolderSingleton getInstance() {
        return Holder.INSTANCE;
    }
}
