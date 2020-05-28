package jason.designpatterns.interpreter.expression;

/**
 * 非终结符表达式类
 *
 * @author Jason Hou
 */
public class NumberInterpreter implements Interpreter {

    private final int number;

    public NumberInterpreter(int number) {
        this.number = number;
    }

    @Override
    public int interpret() {
        return number;
    }

}
