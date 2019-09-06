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
        
        System.out.println("--------Insirar a opção correta para a função");
                System.out.println("System.out.print---------");
                      System.out.println("--------A - Imprime uma mensagem na tela e pula uma linha---------");
        System.out.println("--------B - Imprime uma mensagem na tela e continua na mesma linha---------");
        System.out.println("--------C - Solicita um dado para o usuario---------");
        System.out.println("--------D - Realiza a soma de dois ou mais numeros ---------");
        System.out.println("--------E - Concatena uma String com outro dado ---------");

        
    

        System.out.println("---------------------------");

                 
        String dia = teclado.next();
                 
        switch(dia){
            case "A":
                 case "a":
             System.out.println("-------- Errado ---------");
                break;
            case "b":
                case "B":
          System.out.println("-------- Correto ---------");
                break;
            case "C":
                case "c":
           System.out.println("-------- Errado ---------");
                break;
           case "d":
               case "D":
          System.out.println("-------- Errado ---------");
                break;
             case "e":
                   case "E":
        System.out.println("-------- Errado ---------");
                break;
            default:    
            System.out.println("-------- Opção invalida ---------");
                break;
        }
    }
    
}
