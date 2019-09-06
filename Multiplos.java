/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.util.Scanner;

/**
 *Dado um valor inteiro N imprimir os 3 primeiros múltiplos deste
valor;
 * 
 * @author daniel.sbastos1
 */
public class Multiplos {
    
    public static void main(String [] args){

            int v1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro de 0 a 10");
        
        v1 = entrada.nextInt();


        
                System.out.println("M 1 : " + v1 * 1 );
                System.out.println("M 2 : " + v1 * 2 );

                System.out.println("M 3 : " + v1 * 3 );

        
            
        }
    
}
