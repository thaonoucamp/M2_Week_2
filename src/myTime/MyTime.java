package myTime;

import java.util.Calendar;
import java.util.Date;

public class MyTime {
    private double start;
    private double end;

    public MyTime(double start, double end) {
        this.start = start;
        this.end = end;
    }

    public double getStart() {
        return start;
    }

    public void setStart(double start) {
        this.start = start;
    }

    public double getEnd() {
        return end;
    }

    public void setEnd(double end) {
        this.end = end;
    }

    public double startTime() {
        return start;
    }

    public double reset() {
        return start;
    }

    public double stop() {
        return end;
    }

    public double getElapsedTime() {
        return start;
    }

    public static void main(String[] args) {
        Date now = new Date();
        System.out.println(now);

        Date now2 = new Date();

        if (now.equals(now2)) {
            System.out.println("bang nhau");
        }
        if (now.before(now2)) {

        }
        if (now.after(now2)) {

        }
        System.out.println(now.getTime()); // tra ve mili giay;

        now.setTime(0);

        Calendar ca = Calendar.getInstance();
        System.out.println(ca.getTime()); // tra ve ngay thang hien tai trong he thong;
//
//        ca.add(Calendar.HOUR,-1);
//        ca.add(Calendar.DATE,-1);

//        System.out.println(ca.getTime());

    }
}
