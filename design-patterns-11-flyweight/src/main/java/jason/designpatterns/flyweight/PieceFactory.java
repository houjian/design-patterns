package jason.designpatterns.flyweight;

/**
 * 棋子工厂
 * 享元工厂角色
 *
 * @author Jason Hou
 */
public class PieceFactory {

    private final AbstractPiece black = new BlackPieces();
    private final AbstractPiece white = new WhitePieces();

    public AbstractPiece getBlack() {
        return black;
    }

    public AbstractPiece getWhite() {
        return white;
    }

}
