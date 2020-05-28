package jason.designpatterns.mediator;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体中介者，协调各个同事角色之间的交互关系
 *
 * @author Jason Hou
 */
public class ConcreteMediator implements Mediator {

    /**
     * 定义一个 List 来管理同事对象
     */
    private final List<AbstractColleague> colleagueList = new ArrayList<>();

    @Override
    public void register(AbstractColleague colleague) {
        if (colleagueList.contains(colleague)) {
            return;
        }
        colleagueList.add(colleague);
        colleague.setMediator(this);
    }

    @Override
    public void relay(AbstractColleague colleague) {
        for (AbstractColleague c : colleagueList) {
            if (c.equals(colleague)) {
                continue;
            }
            c.receive();
        }
    }

}
