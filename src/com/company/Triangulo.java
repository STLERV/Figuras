package com.company;

public class Triangulo extends Figura {



     private double base;
    private double altura;


    public Triangulo(double a, double b) {

        a = this.base;
        b = this.altura;

    }

    public double area()
    {
        double area;
        area = (this.base * this.altura) /2;
        return area;

    }

}












