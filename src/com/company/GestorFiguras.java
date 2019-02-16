package com.company;

public interface GestorFiguras {


    public static double suma(Figura[] l) {

        double res = 0;
        for (Figura f : l) {
            res = f.area() + res;
            System.out.println("resbucle " + res);

        }
        System.out.println("res " + res);

        return res;

    }




    public static void main(String[] args) {


        Figura[] f = new Figura[4];

        f[0] = new Circulo(200);
        f[1] = new Triangulo (3, 4);
        f[2] = new Rectangulo(5, 5);
        f[3] = new Cuadrado (64);

        System.out.println("La suma de las areas es: " + suma(f));


    }
}
