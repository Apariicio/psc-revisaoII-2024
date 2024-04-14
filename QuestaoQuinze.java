package RevisaoDois;
/*Escreva um código Java que lê o salário
 de um funcionário e calcula o seu imposto de renda */
import java.util.Scanner;
public class QuestaoQuinze {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
      while (true) {
        System.out.println("Informe o salário do funcionário: ");
        double salario = scanner.nextDouble();
        if (salario == 0){
            System.out.println("Obrigado por utilizar o calculador de IR.");
            break;
        }if (salario <= 2259.20){
            System.out.println("isento de taxa");
        }else if (salario <= 2828.65){
            System.out.println((salario * 0.075) + " é o valor a ser pago de taxa.");
        }else if (salario <= 3751.05){
            System.out.println((salario * 0.15) + " é o valor a ser pago de taxa.");
        }else if (salario <= 4664.68){
            System.out.println((salario * 0.225) + " é o valor a ser pago de taxa.");
        }else if (salario > 4664.68){
            System.out.println((salario * 0.275) + " é o valor a ser pago de taxa.");
        }
    }
    scanner.close();
    }
}