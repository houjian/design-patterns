package jason.designpatterns.memento;

/**
 * 备忘录
 * 负责存储发起人的内部状态，在需要的时候提供这些内部状态给发起人
 *
 * @author Jason Hou
 */
public class ChessMemento {

    private final int x;
    private final int y;

    public ChessMemento(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

}
