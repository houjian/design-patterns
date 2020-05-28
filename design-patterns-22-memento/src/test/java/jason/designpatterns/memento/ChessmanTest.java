package jason.designpatterns.memento;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class ChessmanTest {

    private final Caretaker caretaker = new Caretaker();
    private final Chess chess = new Chess("车");

    @Test
    public void testChessman() {
        for (int i = 0; i < 3; i++) {
            play(i, i + 1);
        }
        undo();
        undo();
        redo();

        for (int i = 0; i < 2; i++) {
            play(i, i + 1);
        }
        undo();
        redo();
    }

    /**
     * 悔棋，撤销到上一个备忘录
     */
    public void play(int x, int y) {
        chess.setLocation(x, y);
        chess.show();
        caretaker.add(chess.save());
    }

    /**
     * 悔棋，撤销到上一个备忘录
     */
    public void undo() {
        System.out.println("******悔棋******");
        ChessMemento prev = caretaker.prev();
        if (prev == null) {
            System.out.println("没有上一步");
        } else {
            chess.restore(prev);
            chess.show();
        }
    }

    /**
     * 撤销悔棋
     */
    public void redo() {
        System.out.println("******撤销悔棋******");
        ChessMemento next = caretaker.next();
        if (next == null) {
            System.out.println("没有下一步");
        } else {
            chess.restore(next);
            chess.show();
        }
    }

}
