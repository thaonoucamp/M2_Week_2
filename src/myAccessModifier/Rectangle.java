package myAccessModifier;

public class Rectangle {
    private double radius = 1.0;
    private String color = "red";

    public Rectangle() {}

    public Rectangle(double radius, String color) {
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * this.radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "radius=" + this.radius +
                ", color='" + this.color + '\'' +
                '}';
    }
}
