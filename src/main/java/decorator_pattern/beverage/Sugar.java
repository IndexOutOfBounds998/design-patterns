package decorator_pattern.beverage;

/**
 * Created by yang on 2019/4/14.
 */
public class Sugar extends CondimentDecorator {

    Beverage beverage;


    public Sugar(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDesc() {
        return beverage.getDesc() + "加糖";
    }

    double cost() {
        return .6 + beverage.cost();
    }
}
