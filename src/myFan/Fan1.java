package myFan;

public class Fan1 extends Fan{
    @Override
    public String toString() {
        return this.toString();
    }

    public static void main(String[] args) {
        Fan fan1 = new Fan();

        fan1.setSpeed(3);
        fan1.setRadius(10);
        fan1.setOn(true);
        fan1.setColor("yellow");

        System.out.println(fan1.toString());

    }
}
