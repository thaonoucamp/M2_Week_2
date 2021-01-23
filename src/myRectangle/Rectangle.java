package myRectangle;

public class Rectangle {
    int width;
    int height;

    public Rectangle() {}

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public String toString() {
        return "Rectangle{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public Rectangle(int width, int height) {
        this.width = width;
        this.height = height;
    }

    public int getArea(int width, int height) {
        return this.width * this.height;
    }

    public int getPerimeter(int width, int height) {
        return 2 * (this.height + this.width);
    }

}
