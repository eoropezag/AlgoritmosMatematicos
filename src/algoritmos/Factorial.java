/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;

/**
 * 
 * @author Emmanuel Oropeza Gonzalez <ekg_123@hotmail.com>
 */

import java.util.Scanner;

public class Factorial 
{

    public static void main(String[] args)
    {
        Scanner numeroIngresado = new Scanner(System.in);
        
        System.out.println("introduce un numero y te devolvere su factorial: ");
        
        long numero = numeroIngresado.nextLong();
        
        System.out.println("El factorial de " + numero  + " es : " + factorial(numero));
    }
    
    public static long factorial (long numero)
    {
        if(numero == 0)
        {
            return 1;
        }
        else
        {
            long numeroFactorial =  numero * factorial(numero  - 1);
            System.out.println(numeroFactorial);
             return  numeroFactorial;
        }
    }    
}


