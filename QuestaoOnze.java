package RevisaoDois;
/*Escreva um código Java que
 simula o jogo de pedra, papel e tesoura. */
 import java.util.Scanner;
 import java.util.Random;
public class QuestaoOnze {
    public static void main(String[] args) {        
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        while (true){
        System.out.println("**PEDRA PAPEL TESOURA**");
        System.out.println();
        System.out.println("Jogador, escolha um item onde: \n***1.Pedra \n***2.Papel \n***3.Tesoura \n***0.Sair");
        int jogUm = scanner.nextInt();
        if (jogUm == 0){
            System.out.println("Obrigado por jogar!!");
            break;
        }else if (jogUm >3){
            System.out.println("***Opcao invalida, faça a escolha correta***");
            System.out.println("------------------------------------------");
            continue;}
        int comp = random.nextInt(3) +1;
        String[] op = {"Pedra" , "Papel" , "Tesoura"};
        String  resu = jogUm == comp ? "Empate" : (jogUm - comp == 1 || jogUm - comp == -2) ? "Voce venceu" : "Voce perdeu";
        System.out.println("O computador escolheu: " + op[comp -1]);
        System.out.println(resu);
        System.out.println("--------------------------");
        }
        scanner.close();
    }    
}