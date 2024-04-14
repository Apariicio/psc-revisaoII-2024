package RevisaoDois;
/*10.	Escreva um código Java
 que calcula o desconto de um produto
  com base em seu valor original.  */
  import java.util.Scanner;
public class QuestaoDez {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("*****VENDA COM DESCONTO*****");
        System.out.println();
        System.out.print("Insira o valor do produto: ");
        double vaPro = scanner.nextDouble();
        System.out.print("Insira a porcentagem para desconto: ");
        double porcent = scanner.nextDouble();        
        double desconto = (porcent/100)*vaPro;
        double vaFinal = vaPro-desconto;
        double vaDesc = vaPro-vaFinal;
        System.out.println(vaDesc + " é o valor do desconto a ser aplicado sobre a venda.\n");
        System.out.println("Valor a ser pago com desconto é: " + vaFinal);
        scanner.close();
    }    
}