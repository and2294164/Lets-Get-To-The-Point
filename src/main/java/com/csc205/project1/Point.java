package com.csc205.project1;
import java.lang.Math;

import static java.lang.Math.*;

public class Point {

    private double x;
    private double y;

    /* -----------------CONSTRUCTORS----------------- */

    public Point() {

        x = 0.0;
        y = 0.0;

    }

    public Point(double xValue, double yValue) {

        x = xValue;
        y = yValue;

    }

    /* -----------------SETTERS----------------- */

    public void setX(double xValue) {

        x = xValue;

    }

    public void setY(double yValue) {

        y = yValue;

    }

    public void setPoint(double xValue, double yValue) {

        x = xValue;
        y = yValue;

    }

    /* -----------------GETTERS----------------- */

    public double getX() {

        return x;

    }

    public double getY() {

        return y;

    }

    /* -----------------MODIFIERS----------------- */

    public double distance(Point pointTwo) {

        return sqrt( Math.pow(x - pointTwo.getX(), 2) + Math.pow(y - pointTwo.getY(), 2)  );

    }

    public void shiftX(double xValue) {

        x += xValue;

    }

    public void shiftY(double yValue) {

        y += yValue;

    }

    public void rotate(double theta) {

        double tempX = x;
        double tempY = y;

        x = tempX * cos(theta) - tempY * sin(theta);
        y = tempX * sin(theta) + tempY * cos(theta);


    }

    public String toString() {

        return "{x = " + x + ", y = " + y + "}";

    }
}
