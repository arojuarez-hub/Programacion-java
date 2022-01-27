package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

public class HolaTeclado
{
    public static void main(String args[])
    {
        Scanner teclado = new Scanner(System.in);
        //InputStreamReader entrada = new InputStreamReader(System.in);
        //BufferedReader teclado = new BufferedReader(entrada);

        String nombre;
        int edad;

        System.out.println("Dime tu nombre: ");
        nombre = teclado.next();

        System.out.println("Dime tu edad: ");
        edad = teclado.nextInt();

        System.out.println("Hola" + nombre + "tienes" + edad + "años");

    }
}
