package strategy_patterns;

/**
 * 用翅膀飞的行为实现
 * Created by yang on 2019/4/11.
 */
public class FlyWithWings implements FlyBehavior {
    public void fly() {
        System.out.println("带着翅膀飞行！卡卡卡");
    }
}
