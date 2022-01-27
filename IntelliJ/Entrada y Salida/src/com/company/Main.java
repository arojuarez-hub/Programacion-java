package com.company;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        //pedirConShowInputDialog();
        //pedirConScanner();
        //pedirConBufferedReader();
    }

    static void pedirConBufferedReader()
    {
        //Objeto
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);

        try
        {
            //Leer String
            System.out.println("¿Cúa es tu nombre?");
            String nombre = teclado.readLine();
            System.out.println("Tu nombre es: " + nombre);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);

        }

        try
        {
            //Leer entero
            System.out.println("¿Cúa es tu edad?");
            int edad = Integer.parseInt(teclado.readLine());
            System.out.println("Tu nombre es: " + edad);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);

        }

        try
        {
            //Leer double
            System.out.println("¿Cúa es tu estatura?");
            double estatura = Double.parseDouble(teclado.readLine());
            System.out.println("Tu estatura es: " + estatura);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);

        }

        try
        {
            //Leer float
            System.out.println("¿Cúa es tu peso?");
            float peso = Float.parseFloat(teclado.readLine());
            System.out.println("Tu peso es: " + peso);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);

        }

        try
        {
            //Leer char
            System.out.println("¿Cúa es tu letra favorita");
            char letra = teclado.readLine().charAt(0);
            System.out.println("Tu letra favorita es: " + letra);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);

        }
    }

        static void pedirConShowInputDialog()
    {
        //Cadena
        String nombre = JOptionPane.showInputDialog("¿Cúal es tu nombre?");
        JOptionPane.showMessageDialog(null, "Tu nombre es: " + nombre);

        //Entero
        int año = Integer.parseInt(JOptionPane.showInputDialog("¿Cúa es el año actual"));
        JOptionPane.showMessageDialog( null, "El año es: " + año);

        //Letra
        char letra = JOptionPane.showInputDialog("Digite una letra?").charAt(0);
        JOptionPane.showMessageDialog( null, "El caracter es: " + letra);

        //Decimal
        double estatura = Double.parseDouble(JOptionPane.showInputDialog("¿Cúa es tu estatura?"));
        JOptionPane.showMessageDialog(null, "Tui estatura es: " + estatura);

    }

        static void pedirConScanner()
        {

            //Scanner
            Scanner teclado = new Scanner(System.in);

            //Enteros
            System.out.println("¿Cual es el año actual");
            int annio = teclado.nextInt();
            System.out.println("El año actual es " + annio);

            //Dato flotanto
            System.out.println("Ingresa un valor con decimas");
            float valor1 = teclado.nextFloat();
            System.out.println("El valor ingresado es: " + valor1);

            //Dato double
            System.out.println("¿Cúal es tu peso");
            double peso = teclado.nextDouble();
            System.out.println("El valor ingresado es: " + peso);

            //Dato next, solo utiliza la primer palabra de una cadena
            System.out.println("Ingresa tu primer nombre");
            String nombre = teclado.next();
            System.out.println("Tu primer nombre es: " + nombre);

            //Dato nextLine, recibe toda la cadena
            System.out.println("Ingresa tu nombre completo");
            String nombrefull = teclado.nextLine();
            System.out.println("Tu nombre completo es: " + nombrefull);

            //Dato charAT
            System.out.println("Ingresa la inicial de tu nombre");
            char inicial = teclado.next().charAt(0);
            System.out.println("La inicial es: " + inicial);

        }

}
