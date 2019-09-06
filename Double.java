/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.util.Scanner;

/**
 *
 * Dados 3 valores reais (float ou double) imprimir o valor do
produto destes valores;

 * @author daniel.sbastos1
 */
public class Double {
    
        public static void main(String [] args){

            double v1,v2,v3 ;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite 3 Valores Double");
        
        v1 = entrada.nextDouble();
                v2 = entrada.nextDouble();

                        v3 = entrada.nextDouble();

        
                System.out.println("Valor 1 : " + v1 );
                                System.out.println("Valor 2 : " + v2 );

                                                System.out.println("Valor 3 : " + v3 );

        
            
        }
    
}
