package com.company;

import java.util.Scanner;

public class Main
{

    public static void main(String[] args)
    {
        double r = 31;
        double s = 6;
        double t;

        // Multiplicación con dos variables
        t = r * s;
        System.out.println(r + " * " + s + " = " + t);

        //Suma con dos variables
        t = r + s;
        System.out.println(r + " + " + s + " = " + t);

        //Resta con dos variables
        t = r - s;
        System.out.println(r + " - " + s + " = " + t);

        //Division con dos variables
        t = r / s;
        System.out.println(r + " / " + s + " = " + t);

        //Uso de tipo de dato cáracter,
        String nombre = "Arturo";
        System.out.println("Hola " + nombre);

        //Genero objeto para entrar datos
        Scanner entrada = new Scanner(System.in);

        //Solicito un número
        System.out.println("Ingresa un número entero");
        r = entrada.nextInt();

        //Solicito otro número
        System.out.println("Ingresa otro número entero");
        s = entrada.nextInt();

        // Multiplicar
        t = r * s;
        System.out.println(r + " * " + s + " = " + t);

        //Suma con dos variables ingresadas por el usuario
        t = r + s;
        System.out.println(r + " + " + s + " = " + t);

        //Resta con dos variables ingresadas por el usuario
        t = r - s;
        System.out.println(r + " - " + s + " = " + t);

        //Dividisión con dos variables ingresadas por el usuario
        t = r / s;
        System.out.println(r + " / " + s + " = " + t);

    }
}
