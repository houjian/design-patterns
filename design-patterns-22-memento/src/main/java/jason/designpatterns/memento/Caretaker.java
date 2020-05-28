package jason.designpatterns.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * 管理者
 * 保存与获取备忘录的功能，但其不能对备忘录的内容进行访问与修改
 *
 * @author Jason Hou
 */
public class Caretaker {

    /**
     * 定义一个集合来存储备忘录
     */
    private final List<ChessMemento> mementoList;

    private int index;

    public Caretaker() {
        this.mementoList = new ArrayList<>();
        this.index = -1;
    }

    public void add(ChessMemento memento) {
        final int next = index + 1;
        if (next >= mementoList.size()) {
            mementoList.add(memento);
        } else {
            mementoList.set(next, memento);
            mementoList.subList(next + 1, mementoList.size()).clear();
        }
        index = next;
    }

    /**
     * 上一个备忘录
     */
    public ChessMemento prev() {
        final int prev = index - 1;
        if (prev >= 0) {
            index = prev;
            return mementoList.get(prev);
        }
        return null;
    }

    /**
     * 下一个备忘录
     */
    public ChessMemento next() {
        final int next = index + 1;
        if (next < mementoList.size()) {
            index = next;
            return mementoList.get(next);
        }
        return null;
    }

}
