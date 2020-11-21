/*
 * Calcular potência de um número do 0 até o 15.
 */
package potencia_fabiana.java;

import java.util.Scanner;

/**
 *
 * @Fabiana Gontijo
 */
public class Potencia_FabianaJava {

    
    public static void main(String[] args) {
        Scanner valor= new Scanner (System.in);
        
        int number,R,i;
        
        System.out.println("Informe o número:");
        number = valor.nextInt();
        
        for(i=0;i<15;i++)
        {
            
       R = (int)Math.pow(number,i);
       System.out.println(number +"^"+"="+R);
        }
        
    }
    
}
