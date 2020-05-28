package jason.designpatterns.bridge;

import jason.designpatterns.bridge.color.BlackColor;
import jason.designpatterns.bridge.color.Color;
import jason.designpatterns.bridge.color.YellowColor;
import jason.designpatterns.bridge.texture.LeatherTexture;
import jason.designpatterns.bridge.texture.PlasticTexture;
import jason.designpatterns.bridge.texture.Texture;
import org.junit.Test;

/**
 * @author Jason Hou
 */
public class BridgeTest {

    @Test
    public void test() {
        // 多个维度组合
        Color yellowColor = new YellowColor();
        Color blackColor = new BlackColor();

        Texture leatherTexture = new LeatherTexture();
        Texture plasticTexture = new PlasticTexture();

        AbstractBag yellowLeatherBag = new HandBag(yellowColor, leatherTexture);
        System.out.println(yellowLeatherBag.show());

        AbstractBag yellowPlasticBag = new HandBag(yellowColor, plasticTexture);
        System.out.println(yellowPlasticBag.show());

        AbstractBag blackLeatherBag = new HandBag(blackColor, leatherTexture);
        System.out.println(blackLeatherBag.show());

        AbstractBag blackPlasticBag = new HandBag(blackColor, plasticTexture);
        System.out.println(blackPlasticBag.show());
    }

}
