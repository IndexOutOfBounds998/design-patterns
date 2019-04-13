package decorator_pattern.beverage;

/**
 * Created by yang on 2019/4/13.
 */
public abstract class Beverage {

    String desc="饮料基类";

    public String getDesc() {
        return desc;
    }

    abstract double cost();

}
