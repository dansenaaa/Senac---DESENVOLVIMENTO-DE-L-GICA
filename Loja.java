        /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula4;

import java.util.Scanner;

/**
 *Uma loja oferece para seus clientes um desconto de acordo com o valor da
compra. Este desconto é de 20% se o valor da compra for maior ou igual a R$
300,00 e 15% se for menor. Dado o valor do produto, mostre o valor (descontado)
da compra do cliente e o valor do desconto obtido;
 * 
 * @author daniel.sbastos1
 */
public class Loja {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Insira o valor da compra");
        
        double valor = teclado.nextInt();
        
        if (valor >= 300) {
            
            valor = valor - (valor *0.25);
            
                    System.out.println("Valor de desconto" + (valor *0.20) );
                    
                    

        } else if (valor <= 300) {
            
                        valor = valor - (valor *0.20);
                                System.out.println("Valor de desconto" + (valor *0.15));
        }
        
    }
    
}
