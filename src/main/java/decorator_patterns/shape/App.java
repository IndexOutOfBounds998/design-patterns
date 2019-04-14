package decorator_patterns.shape;

/**
 * Created by yang on 2019/4/13.
 */
public class App {

    public static void main(String[] args) {

        //画一个圆
        Circle circle = new Circle();
        //给圆加上红色边框
        ShapeDecorator redShapeDecorator = new RedShapeDecorator(circle);
        //给圆加上点
        redShapeDecorator = new PointShapeDecorator(redShapeDecorator);
        //开始绘画
        redShapeDecorator.draw();
    }
}
