package jason.designpatterns.flyweight;

/**
 * 棋子类
 * 抽象享元角色，是所有的具体享元类的基类，为具体享元规范需要实现的公共接口
 *
 * @author Jason Hou
 */
public abstract class AbstractPiece {

    /**
     * 棋子类型
     *
     * @return 类型
     */
    public abstract String getType();

    /**
     * 旗子放在哪个点是外部决定的状态，非享元的外部状态以参数的形式通过方法传入
     *
     * @param x x坐标
     * @param y y坐标
     * @return 结果
     */
    public String put(int x, int y) {
        return getType() + String.format("(%d, %d)", x, y);
    }

}
