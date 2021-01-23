package myFan;

public class Fan2 extends Fan{
    @Override
    public String toString() {
        return this.toString();
    }

    public static void main(String[] args) {
        Fan fan2 = new Fan();

        fan2.setColor("blue");
        fan2.setOn(false);
        fan2.setRadius(5);
        fan2.setSpeed(2);

        System.out.println(fan2.toString());
    }
}
