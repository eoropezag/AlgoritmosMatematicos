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
public class NumerosPrimos 
{
    public void obtenerNumerosPrimos(int numeroLimite)
    {
        for(int i=1; i <= numeroLimite; i++)
        {
            if(esPrimo(i))
            {
                System.out.println("Numero Primo: " + i);
            }
        }
    }
    
    public boolean esPrimo(int numeroAValidar)
    {
        int numeroAuxiliar;
        for(int cont=2; cont < numeroAValidar; cont++)
        {
            numeroAuxiliar = numeroAValidar% cont;
            if(numeroAuxiliar == 0)
                return false;
        }
        return true;
    }
}
