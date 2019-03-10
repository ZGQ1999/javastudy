package week1.shape;

/**
 * created by 国庆
 */
public class Test {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        circle.name = "圆形";
        System.out.println(circle.name + "面积：" + circle.getArea());
        Rectangle rectangle = new Rectangle(6, 3);
        rectangle.name = "矩形";
        System.out.println(rectangle.name + "面积：" + rectangle.getArea());
    }
}
