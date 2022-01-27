package com.company;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Teclado
{
    public static char LeeCaracter()
    {
        char ch;
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado = new BufferedReader(entrada);
        try
        {
            //Lee caracter
            System.out.println("Ingresa tu nombre ");
            ch = teclado.readLine().charAt(0);
            System.out.println("La incial de tu nombre es: " + ch);
        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);
            ch = 0;
        }
        return ch;
    }

    public static String LeeCadena()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str;
        try
        {
            //Leer String
            System.out.println("¿Cúa es tu nombre?");
            str = br.readLine();
            System.out.println("Tu nombre es: " + str);
        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);
            str = "";

        }
        return str;
    }

    public static int LeeEntero()
    {
        InputStreamReader entrada = new InputStreamReader(System.in);
        BufferedReader teclado1 = new BufferedReader(entrada);
        int num;
        try
        {
            //Leer entero
            System.out.println("¿Cúa es tu edad?");
            num = Integer.parseInt(teclado1.readLine());
            System.out.println("Tu edad es: " + num);

        }
        catch (Exception e)
        {
            //Muestra error, si hay.
            System.out.println("Ups, pusiste un tipo de dato equivocado. El error es:");
            System.out.println(e);
            num = 0;
        }
        return num;

    }

}
