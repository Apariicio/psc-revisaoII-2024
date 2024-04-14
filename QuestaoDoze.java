package RevisaoDois;
/*Escreva um código Java que lê uma string
 e verifica se ela é um palíndromo. */
import java.util.Scanner;
public class QuestaoDoze {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite algo para verificar se é um palíndromo:");
        String algo = scanner.nextLine();
        if (isPalindrome(algo)) {
            System.out.println("É um palíndromo.");
        } else {
            System.out.println("Não é um palíndromo.");
        }
        scanner.close();
    }    
    public static boolean isPalindrome(String str) {
        str = str.replaceAll("\\s+", "").toLowerCase();
        return str.equals(new StringBuilder(str).reverse().toString());
    }
}