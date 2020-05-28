package jason.designpatterns.bridge.texture;

/**
 * 皮革材质扩展实现
 *
 * @author Jason Hou
 */
public class LeatherTexture implements Texture {

    @Override
    public String getTextureName() {
        return "皮革";
    }

}
