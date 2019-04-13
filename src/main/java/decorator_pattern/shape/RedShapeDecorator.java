package decorator_pattern.shape;

/**
 * Created by yang on 2019/4/13.
 */
public class RedShapeDecorator extends ShapeDecorator {

    Shape shape;

    public RedShapeDecorator(Shape shape) {
        this.shape = shape;
    }


    @Override
    public void draw() {
        shape.draw();
        System.out.println("给形状加上红色的边框");
    }


}
