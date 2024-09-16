package org.example.task1.Clock;

public class Main {
    public static void main(String[] args) {

        Clock time1 = new Clock();
        time1.setHours(8);
        time1.setMinutes(56);
        time1.setSeconds(22);
        int hours1 = time1.getHours();
        int minutes1 = time1.getMinutes();
        int seconds1 = time1.getSeconds();

        time1.readTime();
        time1.tick(1);
        time1.readTime();
    }
}
