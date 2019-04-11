package strategy_patterns;

/**
 * 策略模式
 * Created by yang on 2019/4/11.
 */
public abstract class Duck {

    FlyBehavior flyBehavior;

    QuackBehavior quackBehavior;

    public Duck() {
    }

    /**
     * 给超类鸭子设置飞行属性
     * 这里可以动态的给具体鸭子附上行为
     *
     * @param flyBehavior
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 给超类鸭子设置叫属性
     *
     * @param quackBehavior
     */
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    /**
     * 抽象方法定义鸭子显示的特性
     */
    public abstract void display();


    public void performFly() {

        flyBehavior.fly();
    }

    public void performQuack() {

        quackBehavior.quack();
    }


    public void swim() {

        System.out.println("所有的鸭子都会 划水");
    }
}
