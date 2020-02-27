package com.example.armgame;

public class Segment {
    private Vector a;
     private Vector b;
    private double magnitude;
    private double hetheta;

    public Segment(Vector vector, double magnitude, double hetheta) {
        this.a = vector;
        this.magnitude = magnitude;
        this.hetheta = hetheta;
        calculateB();
    }

    public Vector getA() {
        return a;
    }

    public void setA(Vector a) {
        this.a = a;
    }

    public Vector getB() {
        return b;
    }

    public void setB(Vector b) {
        this.b = b;
    }

    public double getMagnitude() {
        return magnitude;
    }

    public void setMagnitude(double magnitude) {
        this.magnitude = magnitude;
    }

    public double getHetheta() {
        return hetheta;
    }

    public void setHetheta(double hetheta) {
        this.hetheta = hetheta;
    }

    public void calculateB(){
        double x=a.getX() +magnitude* Math.sin(Math.toRadians(hetheta));
        double y=b.getY() +magnitude *Math.cos(Math.toRadians(hetheta));
        b=new Vector(x,y);
    }
}

