/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package algoritmos;

import java.util.Scanner;

/**
 * 
 * @author Emmanuel Oropeza Gonzalez <ekg_123@hotmail.com>
 */
public class SerieDeFibonnacci 
{
    public static void main(String[] args)
    {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Introdusca hasta que numero desea la serie de fibonnacci");
        long numero = entrada.nextLong();
        int  var, a, b;
        a = 0;//2 numeros antes
        b = 1; //1 numero antes
        var = 1;
        System.out.println(b);
        for(int i = 0; i < numero; i++)
        {
            System.out.println(var);
            a=b;
            b=var;
            var = a+b;
        }
    }
}
