/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula4;

import java.util.Scanner;

/**
 *
 * Dados 3 valores (possíveis lados) verificar se eles formam um triângulo, e em caso
positivo, dizer se é equilátero, isósceles ou escaleno;
 * 
 * @author daniel.sbastos1
 */
public class Triangulo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int n1,n2,n3;
        System.out.println("Insira 1° valor : ");
        n1 = teclado.nextInt();
          System.out.println("Insira 2° valor : ");
        n2 = teclado.nextInt();
          System.out.println("Insira 3° valor : ");
        n3 = teclado.nextInt();
        
        
        if (n1 == n2 && n2==n3) {
            System.out.println("Triangulo Escaleno");
        } else if(n1 == n2 || n1 == n3 || n2 == n3){
                        System.out.println("Triangulo Isósceles");

        }else{
                                    System.out.println("Escaleno");

        }
    }
    
}
