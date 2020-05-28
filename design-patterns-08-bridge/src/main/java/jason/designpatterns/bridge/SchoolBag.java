package jason.designpatterns.bridge;

import jason.designpatterns.bridge.color.Color;
import jason.designpatterns.bridge.texture.Texture;

/**
 * 书包扩展抽象化
 *
 * @author Jason Hou
 */
public class SchoolBag extends AbstractBag {

    public SchoolBag(Color color, Texture texture) {
        super(color, texture);
    }

    @Override
    public String getTypeName() {
        return "书包";
    }

}
