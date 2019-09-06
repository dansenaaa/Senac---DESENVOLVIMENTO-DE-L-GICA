/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.io.UnsupportedEncodingException;
import java.util.Scanner;

/**
 *
 * @author daniel.sbastos1
 */
public class HelloWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws UnsupportedEncodingException {
                        String nome ;

        System.out.println("Olá");
        

     

                
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        
        nome = entrada.next();  
        
           
        byte ptext[] = nome.getBytes("ISO-8859-1"); 
String value = new String(ptext, "UTF-8"); 
        
                System.out.println(nome);

        
        
        
    }
    
    
    

}
