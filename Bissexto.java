/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula4;

import java.util.Scanner;

/**
 *Dado um ano com 4 dígitos dizer ser ele é um ano bissexto ou não. (Lembre-se
que um ano é bissexto se ele for divisível por 400 ou se ele for divisível por 4 e
não por 100.)

 * 
 * @author daniel.sbastos1
 */
public class Bissexto {
    public static void main(String[] args) {
        Scanner ent = new Scanner(System.in);
        int ano;
        
        System.out.println("Digite um ano para saber se é bissexto");
        ano = ent.nextInt();
        
        // se o ano for maior que 400
        if(ano % 400 == 0){
            System.out.println(ano + " é bissexto.");
        // se o ano for menor que 400
        } else if((ano % 4 == 0) && (ano % 100 != 0)){
            System.out.println(ano + " é bissexto.");
        } else{
            System.out.println(ano + " não é bissexto");
        }
    }
}