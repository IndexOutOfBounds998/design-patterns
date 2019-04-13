package decorator_pattern.beverage;

/**
 * Created by yang on 2019/4/14.
 */
public class Moka extends CondimentDecorator {
    Beverage beverage;

    public Moka(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + "加摩卡";
    }

    double cost() {
        return 2.5 + beverage.cost();
    }
}
