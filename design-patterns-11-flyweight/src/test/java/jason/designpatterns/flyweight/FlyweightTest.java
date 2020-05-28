package jason.designpatterns.flyweight;

import org.junit.Assert;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class FlyweightTest {

    @Test
    public void testFlyweight() {
        PieceFactory factory = new PieceFactory();

        AbstractPiece whiteFirst = factory.getWhite();
        AbstractPiece whiteSecond = factory.getWhite();
        AbstractPiece blackFirst = factory.getBlack();
        AbstractPiece blackSecond = factory.getBlack();

        Assert.assertSame(whiteFirst, whiteSecond);
        Assert.assertSame(blackFirst, blackSecond);

        for (int i = 0; i < 2; i++) {
            System.out.println(whiteFirst.put(i, i + 1));
            System.out.println(blackSecond.put(i, i + 2));
        }
    }

}