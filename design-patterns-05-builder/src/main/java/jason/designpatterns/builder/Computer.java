package jason.designpatterns.builder;

/**
 * 产品
 * 包含多个组成部件的复杂对象，由具体建造者来创建其各个滅部件
 *
 * @author Jason Hou
 */
public class Computer {

    private String cpu;
    private String display;

    public String getCpu() {
        return cpu;
    }

    public void setCpu(String cpu) {
        this.cpu = cpu;
    }

    public String getDisplay() {
        return display;
    }

    public void setDisplay(String display) {
        this.display = display;
    }

    public String show() {
        return "Computer{" +
                "cpu='" + getCpu() + '\'' +
                ", display='" + getDisplay() + '\'' +
                '}';
    }

}
