/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula5;

import java.util.Scanner;

/**
 *
 * Utilizando a instrução switch escreva um programa que recebe um valor inteiro de
1 a 7 e retorna o correspondente dia da semana. Considere que 1 corresponde a
domingo, 2 a segunda-feira, ..., 7 a sábado. Além disso, no caso de uma entrada
errada, como por exemplo 0, deve ser impresso “Valor inválido!”;
 * 
 * @author daniel.sbastos1
 */
public class Semana {
    public static void main(String[] args) {
        
         Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------Insira um dia da semana---------");
        System.out.println("--------1 - DOMINGO---------");
        System.out.println("--------2 - SEGUNDA---------");
        System.out.println("--------3 - TERÇA---------");
        System.out.println("--------4 - QUARTA---------");
        System.out.println("--------5 - QUINTA---------");
        System.out.println("--------6 - SEXTA---------");
        System.out.println("--------7 - SABADO---------");
                System.out.println("---------------------------");

                 
        int dia = teclado.nextInt();
                 
        switch(dia){
            case 1:
            System.out.println("--------1 - DOMINGO---------");
                break;
            case 2:
            System.out.println("--------2 - SEGUNDA---------");
                break;
            case 3:
            System.out.println("--------3 - TERÇA---------");
                break;
            case 4:
            System.out.println("--------4 - QUARTA---------");
                break;
            case 5:
            System.out.println("--------5 - QUINTA---------");
                break;
            case 6:
            System.out.println("--------6 - SEXTA---------");
                break;
            case 7:
            System.out.println("--------7 - SABADO---------");
                break;
            default:    
            System.out.println("-------- NUMERO INVALIDO---------");
                break;
             }


    }
    
}
