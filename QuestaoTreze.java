package RevisaoDois;
/*Escreva um código Java
 que lê três números e verifica qual é o maior */
 import java.util.Scanner;
public class QuestaoTreze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);        
        System.out.println("Por favor, digite três números: ");
        int maior = Integer.MIN_VALUE;
        for (int i = 0; i < 3; i++) {
            int numero = scanner.nextInt();
            if (numero > maior) {
                maior = numero;
            }
        }
        System.out.println("O maior número é: " + maior);
        scanner.close();
    }
}