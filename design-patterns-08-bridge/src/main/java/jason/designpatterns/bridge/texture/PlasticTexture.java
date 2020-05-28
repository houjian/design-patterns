package jason.designpatterns.bridge.texture;

/**
 * 塑料材质扩展实现
 *
 * @author Jason Hou
 */
public class PlasticTexture implements Texture {

    @Override
    public String getTextureName() {
        return "塑料";
    }

}
