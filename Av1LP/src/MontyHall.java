import java.util.Scanner;
import java.util.Random;
public class MontyHall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Bem-vindo ao Jogo Monty Hall.");

        int portaPremiada = random.nextInt(3) + 1;
        int portaVazia;
        int portaEscolhida;

        do {
            System.out.println("Escolha uma porta: 1, 2 ou 3. ");
            portaEscolhida = scanner.nextInt();
        } while (portaEscolhida < 1 || portaEscolhida > 3);
        do {
            portaVazia = random.nextInt(3) + 1;
        } while (portaVazia == portaEscolhida || portaVazia == portaPremiada);

        System.out.println("O apresentador abriu a porta: " + portaVazia + " que está vazia." );


        //Oferecer a opção trocar de porta.
        System.out.println("Deseja trocar de porta, sim ou não? ");
        String opcao = scanner.next();
        boolean trocarPorta = opcao.equalsIgnoreCase("S");

        //Determinar a nova porta escolhida.
        int portaEscolhidaOriginal = portaEscolhida;
        if (trocarPorta) {
            do {
                portaEscolhida = random.nextInt(3) + 1;
            } while (portaEscolhida == portaVazia || portaEscolhida == portaEscolhidaOriginal);
            System.out.println("Você trocou de porta " + portaEscolhida + ".");
        }
        if (portaEscolhida == portaPremiada) {
            System.out.println("Você ganhou! parabéns!!");
        }else {
            System.out.println("Você perdeu. A porta premiada foi " + portaPremiada + ".");
        }
        System.out.println("Porta premiada: " + portaPremiada);
        System.out.println("Porta vazia! " + portaVazia);
        System.out.println("Porta Escolhida: " + portaEscolhida);
    }
}