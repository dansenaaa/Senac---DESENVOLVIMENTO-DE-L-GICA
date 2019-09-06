/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula5;

import java.util.Scanner;

/**
 *
 * Implemente uma questão de múltipla escolha referente a alguma das outras
disciplinas que você está cursando neste semestre. Primeiro deverá ser apresentado
o enunciado da questão com as 5 opções/alternativas de resposta, que são (a), (b),
(c), (d) e (e). Depois que o usuário escolher uma opção, se for a resposta correta
deverá ser impresso “Resposta correta”, caso contrário “Resposta incorreta”.
Utilize a instrução switch, invés de if, na implementação.
 * 
 * @author daniel.sbastos1
 */
public class Disciplinas {
    
    public static void main(String[] args) {
        
    
     Scanner teclado = new Scanner(System.in);
        
        System.out.println("--------Insira uma disciplina---------");
        System.out.println("--------A - ALGORITMOS E PROGRAMAÇÃO---------");
        System.out.println("--------B - MATEMÁTICA PARA TECNOLOGIA DA INFORMAÇÃO---------");
        System.out.println("--------C - CONCEITOS DE COMPUTAÇÃO---------");
        System.out.println("--------D - PROJETO INTEGRADOR: DESENVOLVIMENTO DE LÓGICA---------");
        System.out.println("--------E - FUNDAMENTOS DE ADMINISTRAÇÃO---------");

        System.out.println("---------------------------");

                 
        String dia = teclado.next();
                 
        switch(dia){
            case "A":
                 case "a":
            System.out.println("-------- Correto ---------");
                break;
            case "b":
                case "B":
          System.out.println("-------- Correto ---------");
                break;
            case "C":
                case "c":
          System.out.println("-------- Correto ---------");
                break;
           case "d":
               case "D":
         System.out.println("-------- Correto ---------");
                break;
             case "e":
                   case "E":
       System.out.println("-------- Correto ---------");
                break;
            default:    
            System.out.println("-------- Errado ---------");
                break;
        }
    }
    
}
