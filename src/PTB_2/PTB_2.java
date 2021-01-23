package PTB_2;

import java.util.Scanner;

public class PTB_2 {
    private double a;
    private double b;
    private double c;

    public PTB_2() {}

    public PTB_2(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDelta() {
        double delta = Math.pow(this.b, 2) - 4 * this.a * this.c;
        return delta;
    }

    public double getRoot1() {
        return (-(this.b) - Math.sqrt(this.getDelta())) / (2 * this.a);
    }

    public double getRoot2() {
        return (-(this.b) + Math.sqrt(this.getDelta())) / (2 * this.a);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Nhap so a: ");
        double a = scanner.nextDouble();

        System.out.println("Nhap so b: ");
        double b = scanner.nextDouble();

        System.out.println("Nhap so c: ");
        double c = scanner.nextDouble();

        PTB_2 pt2 = new PTB_2(a, b, c);

        System.out.println(pt2.getRoot1());

        System.out.println(pt2.getRoot2());

        System.out.println(pt2.getDelta());

    }
}
