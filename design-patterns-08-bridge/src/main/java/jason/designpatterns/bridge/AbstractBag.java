package jason.designpatterns.bridge;

import jason.designpatterns.bridge.color.Color;
import jason.designpatterns.bridge.texture.Texture;

/**
 * 抽象化
 *
 * @author Jason Hou
 */
public abstract class AbstractBag {

    /**
     * 多个变化维度组合起来
     */
    private final Color color;
    private final Texture texture;

    public AbstractBag(Color color, Texture texture) {
        this.color = color;
        this.texture = texture;
    }

    /**
     * 获取背包类型名
     *
     * @return 类型
     */
    protected abstract String getTypeName();

    public String show() {
        return color.getColorName() + texture.getTextureName() + getTypeName();
    }

}
