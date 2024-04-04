import java.util.Random;
import java.util.Scanner;

public class LotoFacil {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int opcao;

        do {
            exibirMenu();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    apostarNumero(scanner, random);
                    break;
                case 2:
                    apostarLetra(scanner);
                    break;
                case 3:
                    apostarParImpar(scanner);
                    break;
                case 0:
                    System.out.println("Obrigado por jogar!");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        } while (opcao != 0);
    }

    private static void exibirMenu() {
        System.out.println("*************************");
        System.out.println("Lotofácil: ");
        System.out.println("*************************");
        System.out.println("1) Apostar de 0 a 100");
        System.out.println("2) Apostar de A à Z");
        System.out.println("3) Apostar ímpar ou par");
        System.out.println("0) Sair");
        System.out.println("*************************");
        System.out.println("Escolha uma opção: ");
    }

    private static void apostarNumero(Scanner scanner, Random random) {
        int numeroApostado;

        System.out.print("Digite um número entre 0 e 100: ");
        numeroApostado = scanner.nextInt();

        if (numeroApostado < 0 || numeroApostado > 100) {
            System.out.println("Aposta inválida!");
            return;
        }

        int numeroSorteado = random.nextInt(101);

        if (numeroApostado == numeroSorteado) {
            System.out.println("**Você ganhou R$ 530,00 reais!**");
        } else {
            System.out.println("Que pena, o número sorteado foi: " + numeroSorteado);
        }
    }

    private static void apostarLetra(Scanner scanner) {
        char letraApostada = Character.toUpperCase(scanner.next().charAt(0));

        if (!Character.isLetter(letraApostada)) {
            System.out.println("Aposta inválida!");
            return;
        }

        char letraPremiada = 'T'; // Personalize a letra premiada

        if (letraApostada == letraPremiada) {
            System.out.println("**Você ganhou R$ 1.000,00 reais!**");
        } else {
            System.out.println("Que pena, a letra sorteada foi: " + letraPremiada);
        }
    }

    private static void apostarParImpar(Scanner scanner) {
        int numeroApostado;

        System.out.print("Digite um número: ");
        numeroApostado = scanner.nextInt();

        if (numeroApostado % 2 == 0) {
            System.out.println("**Você ganhou R$ 300,00 reais!**");
        } else {
            System.out.println("Que pena, o número digitado é ímpar, e a premiação foi par.");
        }
    }
}
