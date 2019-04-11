package strategy_patterns;

/**
 * 定义一个模型鸭子 不会飞 可以嘎嘎叫
 * 多用接口 少用继承
 * Created by yang on 2019/4/11.
 */
public class ModelDuck extends Duck {
    /**
     * 给模型鸭子附上行为
     */
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();

    }

    public void display() {
        System.out.println("我是一个模型鸭子哦·");
    }

    /**
     * 测试
     *
     * @param args
     */
    public static void main(String[] args) {
        Duck modelDuck = new ModelDuck();
        modelDuck.display();
        modelDuck.performFly();
        modelDuck.performQuack();
        //动态的给模型鸭子加上飞行的属性
        modelDuck.setFlyBehavior(new FlyWithWings());
        modelDuck.performFly();
    }
}
