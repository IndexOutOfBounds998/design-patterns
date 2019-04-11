package strategy_patterns;

/**
 * Created by yang on 2019/4/11.
 */
public class Quack implements QuackBehavior {
    public void quack() {
        System.out.println("我会嘎嘎叫！");
    }
}
