package week1.shape;

/**
 * created by 国庆
 */
public abstract class Shape {
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract double getArea();
}
