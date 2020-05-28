package jason.designpatterns.interpreter;

import jason.designpatterns.interpreter.expression.AddInterpreter;
import jason.designpatterns.interpreter.expression.Interpreter;
import jason.designpatterns.interpreter.expression.MultiInterpreter;
import jason.designpatterns.interpreter.expression.NumberInterpreter;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author Jason Hou
 */
public class Operator {

    private static final String SYMBOL_ADD = "+";
    private static final String SYMBOL_MULTI = "*";

    private static boolean isOperator(String symbol) {
        return ("+".equals(symbol) || "*".equals(symbol));
    }

    private static Interpreter getInterpreter(Interpreter first, Interpreter second, String symbol) {
        switch (symbol) {
            case SYMBOL_ADD:
                return new AddInterpreter(first, second);
            case SYMBOL_MULTI:
                return new MultiInterpreter(first, second);
            default:
                throw new UnsupportedOperationException();
        }
    }

    public static int parse(String expression) {
        Deque<Integer> stack = new LinkedList<>();

        Scanner scanner = new Scanner(expression);
        while (scanner.hasNext()) {
            String symbol = scanner.next();
            boolean isOperator = isOperator(symbol);
            if (isOperator) {
                Interpreter left = new NumberInterpreter(stack.pop());
                Interpreter right = new NumberInterpreter(stack.pop());
                Interpreter result = getInterpreter(left, right, symbol);
                stack.push(result.interpret());
            } else {
                stack.push(Integer.parseInt(symbol));
            }
        }

        return stack.pop();
    }

}
