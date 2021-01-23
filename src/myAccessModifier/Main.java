package myAccessModifier;

public class Main{

    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        double radius = rectangle.getRadius();

        String color = rectangle.getColor();

        rectangle.setRadius(5.0);
        System.out.println("duong kinh: "+rectangle.getRadius());

        rectangle.setColor("color");


        System.out.println(rectangle.getArea());
        System.out.println(rectangle.getPerimeter());

    }
}
