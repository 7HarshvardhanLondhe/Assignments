class Time {
    int hr, min, sec;

    public Time(int hr, int min, int sec) {
        this.hr = hr;
        this.min = min;
        this.sec = sec;
        normalize();
    }


    public void normalize() {
        if (sec >= 60) {
            min += sec / 60;
            sec %= 60;
        }
        if (min >= 60) {
            hr += min / 60;
            min %= 60;
        }
        hr %= 24;
    }


    public void add(Time t) {
        this.hr += t.hr;
        this.min += t.min;
        this.sec += t.sec;
        normalize();
    }

  
    public void add(int seconds) {
        this.sec += seconds;
        normalize();
    }

    
    public void add(int value, String unit) {
        unit = unit.toLowerCase();
        if (unit.equals("hr") || unit.equals("hour") || unit.equals("hours")) {
            this.hr += value;
        } else if (unit.equals("min") || unit.equals("minute") || unit.equals("minutes")) {
            this.min += value;
        } else if (unit.equals("sec") || unit.equals("second") || unit.equals("seconds")) {
            this.sec += value;
        }
        normalize();
    }

    public void display() {
        System.out.printf("%02d:%02d:%02d\n", hr, min, sec);
    }
}

public class TimeTest {
    public static void main(String[] args) {
        Time t1 = new Time(14, 45, 50);
        Time t2 = new Time(3, 20, 30);
        
        System.out.println("--- Time Addition System ---");
        System.out.print("Initial Time 1: ");
        t1.display();
        
        System.out.print("Adding Time object (3 hrs 20 mins 30 secs): ");
        t1.add(t2);
        t1.display(); // Expected with carry over
        
        System.out.print("Adding 5000 seconds: ");
        t1.add(5000);
        t1.display();
        
        System.out.print("Adding 90 minutes: ");
        t1.add(90, "minutes");
        t1.display();
    }
}