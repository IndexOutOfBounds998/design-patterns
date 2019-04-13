package decorator_pattern.beverage;

/**
 * Created by yang on 2019/4/14.
 */
public class Espresso extends Beverage {

    public Espresso() {
        desc = "浓咖啡";
    }

    double cost() {
        return .2;
    }
}
