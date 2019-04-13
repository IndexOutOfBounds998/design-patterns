package decorator_pattern.shape;

/**
 * Created by yang on 2019/4/14.
 */
public class PointShapeDecorator extends ShapeDecorator {

    Shape shape;

    public PointShapeDecorator(Shape shape) {
        this.shape = shape;
    }

    public void draw() {
        shape.draw();
        System.out.println("给形状加上点");
    }
}
