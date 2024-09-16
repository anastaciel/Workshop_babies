package org.example.task1.Clock;

public class Clock implements Readable{
    private  int hours;
    private int minutes;
    private int seconds;

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int tick(int seconds) {
        return  this.seconds += seconds;
    }

    @Override
    public void readTime() {
        System.out.println("Время = " + this.hours + ":" + this.minutes + ":" + this.seconds);
    }
}
