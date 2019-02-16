package com.company;

public class Rectangulo extends Figura {

    private double base;
    private double altura;


    public Rectangulo(double a, double b) {

        a = this.base;
        b = this.altura;

    }

    public double area()
    {
        double area;
        area = this.base * this.altura;
        return area;

    }

}