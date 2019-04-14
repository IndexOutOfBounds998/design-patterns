package decorator_patterns.beverage;

/**
 * Created by yang on 2019/4/14.
 */
public class HouseBlend extends Beverage {

    public HouseBlend() {
        desc = "混合咖啡";
    }

    double cost() {
        return .3;
    }
}
