package jason.designpatterns.bridge;

import jason.designpatterns.bridge.color.Color;
import jason.designpatterns.bridge.texture.Texture;

/**
 * 手包扩展抽象化
 *
 * @author Jason Hou
 */
public class HandBag extends AbstractBag {

    public HandBag(Color color, Texture texture) {
        super(color, texture);
    }

    @Override
    public String getTypeName() {
        return "手包";
    }

}
