package org.example.task1.Point;

public class Point implements  Movable{

    private float x;
    private  float y;

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }


    @Override
    public float moveUp(float shift) {
        return this.y+= shift;
    }

    @Override
    public float moveDown(float shift) {
        return this.y-= shift;
    }

    @Override
    public float moveLeft(float shift) {
        return this.x-= shift;
    }

    @Override
    public float moveRight(float shift) {
        return this.x+= shift;
    }
}
