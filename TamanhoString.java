/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.util.Scanner;

/**
 *Dado um nome (String) não composto, imprimir a quantidade de
caracteres deste nome.

 * 
 * @author daniel.sbastos1
 */
public class TamanhoString {
    
          public static void main(String [] args){

             
                String nome;
                
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        
        nome = entrada.next();
        
                System.out.println("QTD de caracter " + nome.length() );   
              
          }
    
}
