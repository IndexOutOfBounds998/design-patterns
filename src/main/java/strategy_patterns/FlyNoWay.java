package strategy_patterns;

/**
 * Created by yang on 2019/4/11.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("我不会飞啊~");
    }
}
