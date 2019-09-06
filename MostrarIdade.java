/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.util.Scanner;

/**
 *
 * @author daniel.sbastos1
 */
public class MostrarIdade {
    
    public static void main(String [] args){
        
                int idade ;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite sua idade");
        
        idade = entrada.nextInt();
        
                System.out.println("Sua idade é " + idade );
        
        
    }
    
}
