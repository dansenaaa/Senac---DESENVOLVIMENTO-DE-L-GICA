/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi.aula3;

import java.util.Scanner;

/**
 *
 * Dado um valor inteiro de 1 até 10, imprimir a “tabela” da
tabuada deste valor;
 * 
 * @author daniel.sbastos1
 */
public class Tabuada {
    
      public static void main(String [] args){
             int v1;
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Digite um valor inteiro de 1 a 10");
        
        v1 = entrada.nextInt();


        
                System.out.println( v1 + " X 1 = " +v1*1  );
                
                System.out.println( v1+ " X 2 = "+v1*2  );
                System.out.println( v1 +" X 3 = "+v1*3  );
                System.out.println( v1 +" X 4 = "+v1*4  );

                System.out.println( v1 +" X 5 = "+v1*5  );
                  System.out.println( v1 +" X 6 = "+v1*6  );
                System.out.println( v1+ " X 7 = "+v1*7  );
                System.out.println( v1+ " X 8 = "+v1*8  );
                System.out.println( v1 +" X 9 = "+v1*9  );

                System.out.println( v1 +" X 10 = "+v1*10  );
    
}
}
