/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula4;

import java.util.Scanner;

/**
 *
 * @author daniel.sbastos1
 */
public class MaiorIdade {
    
    
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira sua idade");
        
        int idade = teclado.nextInt();
        
        if (idade >= 18 && idade % 3 == 0  ) {
            
        
            
         System.out.println("Maior de idade e multiplo por 3");
            
            
        }else if( idade <= 0){
            
            System.out.println("Idade invalida");
            
        }else  if (idade >= 18 ){
              System.out.println("Maior de idade");
        } else{
            
                        System.out.println("menor de idade");

        }
        
        
    }
}
