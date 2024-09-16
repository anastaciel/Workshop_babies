package org.example.task1.Car;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        car1.setBrand("Тойота");
        car1.setModel("Камри");
        car1.setYear(2023);
        String brand1 = car1.getBrand();
        String model1 = car1.getModel();
        int year1 = car1.getYear();

        car1.start();
        car1.stop();
        car1.drive(650);
    }
}
