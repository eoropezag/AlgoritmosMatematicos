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
public class NumerosPrimosMain
{
            public static void main(String[] args)
            {
            System.out.println("¿Hasta que numero quieres obtener los numeros primos?");
            Scanner entrada = new Scanner(System.in);
               
            int numero = entrada.nextInt();
                    NumerosPrimos  numerosPrimos = new NumerosPrimos();        
                    
                    numerosPrimos.obtenerNumerosPrimos(numero);
            }
                    
    
}
