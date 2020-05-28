package jason.designpatterns.memento;

/**
 * 发起人
 * 记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能
 *
 * @author Jason Hou
 */
public class Chess {

    private final String label;
    private int x;
    private int y;

    public Chess(String label) {
        this.label = label;
    }

    public String getLabel() {
        return label;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setLocation(int x, int y) {
        this.x = x;
        this.y = y;
    }

    /**
     * 保存状态
     */
    public ChessMemento save() {
        return new ChessMemento(this.x, this.y);
    }

    /**
     * 恢复状态
     */
    public void restore(ChessMemento memento) {
        setLocation(memento.getX(), memento.getY());
    }

    public void show() {
        System.out.println(String.format("棋子<%s>：当前位置为：<%d, %d>", getLabel(), getX(), getY()));
    }

}
