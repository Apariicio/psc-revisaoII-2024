package RevisaoDois;
/*Escreva um código Java
 que verifica se um número é par ou ímpar.  */

import java.util.Scanner;
public class QuestaoNove {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Informe sua idade: ");
        int idade = scanner.nextInt();
        System.out.println((idade >=18) ? "** Usuario  é maior  de idade **" : "**Usuario ainda nao é de maior**");
        System.out.println("********************************");
        scanner.close();
    }    
}