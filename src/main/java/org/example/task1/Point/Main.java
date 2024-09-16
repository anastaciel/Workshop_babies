package org.example.task1.Point;

public class Main {
    public static void main(String[] args) {

        Point point1 = new Point();
        point1.setX(5);
        point1.setY(6.78F);
        float x1 = point1.getX();
        float y1 = point1.getY();

        System.out.println(x1);
        System.out.println(y1);
        x1 = point1.moveRight(8);
        y1 = point1.moveDown(6.45F);
        System.out.println(x1);
        System.out.println(y1);
    }
}
