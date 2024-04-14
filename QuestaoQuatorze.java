package RevisaoDois;
/*Escreva um código Java que
 lê a nota de um aluno e verifica se ele foi aprovado ou reprovado */
 import java.util.Scanner;
public class QuestaoQuatorze {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite a nota do aluno:");
        double nota = scanner.nextDouble();        
        if (nota >= 6) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }
        scanner.close();
    }    
}