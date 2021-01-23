package myRectangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap chieu rong: ");
        int width = scanner.nextInt();

        System.out.println("Nhap chieu cao: ");
        int height = scanner.nextInt();


        Rectangle rectangle = new Rectangle(width, height);

        System.out.println(rectangle.toString());

        System.out.println(rectangle.getArea(width, height));

        System.out.println(rectangle.getPerimeter(width, height));


    }
}
