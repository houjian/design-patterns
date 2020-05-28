package jason.designpatterns.command;

import org.junit.Test;

import java.util.List;

/**
 * @author Jason Hou
 */
public class CommandTest {

    @Test
    public void testCommand() {
        AudioPlayer receiver = new AudioPlayer();

        {
            Invoker invoker = new Invoker(new PlayCommand(receiver));
            String result = invoker.invoke();
            System.out.println(result);
        }

        {
            Invoker invoker = new Invoker(new StopCommand(receiver));
            String result = invoker.invoke();
            System.out.println(result);
        }
    }

    @Test
    public void testMacroCommand() {
        AudioPlayer receiver = new AudioPlayer();
        MacroInvoker invoker = new MacroInvoker();
        invoker.add(new PlayCommand(receiver));
        invoker.add(new StopCommand(receiver));
        List<String> result = invoker.invoke();
        System.out.println(result);
    }

}