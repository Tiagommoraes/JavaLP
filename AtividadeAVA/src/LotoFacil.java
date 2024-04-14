import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class LotoFacil extends JFrame {

    //Atributos
    JFrame frame = new JFrame("Loto Fácil");
    JPanel panel = new JPanel();
    JButton jButtonAposta1 = new JButton("Apostar de 0 a 100");
    JButton jButtonAposta2 = new JButton("Apostar de A a Z");
    JButton jButtonAposta3 = new JButton("Apostar em par ou ímpar");
    JButton jButtonSair = new JButton("Sair");

    public LotoFacil() {
        configurarComponentes();
        frame.setSize(400, 250);
        frame.setLocationRelativeTo(null);
        frame.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        frame.setVisible(true);
    }

    public void configurarComponentes() {
        panel.setLayout(new GridLayout(4,1,10,10));
        panel.setBackground(Color.WHITE);

        Font buttonFont = new Font("Times New Roman", Font.BOLD,20);
        panel.setPreferredSize(new Dimension(200, 200));
        panel.setBounds(100,200, 250, 70);

        //Criar Botões
        JButton[] buttons = {
                jButtonAposta1,
                jButtonAposta2,
                jButtonAposta3,
                jButtonSair
        };
        for (JButton button : buttons) {
            button.setPreferredSize(new Dimension(250,50));
            button.setFont(buttonFont);
        }
        for (JButton button : buttons) {
            panel.add(button);
        }
        this.getContentPane().add(panel);
        frame.add(panel);

        jButtonAposta1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta1();
            }
        });

        jButtonAposta2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta2();
            }
        });

        jButtonAposta3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                aposta3();
            }
        });

        jButtonSair.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });

        panel.add(jButtonAposta1);
        panel.add(jButtonAposta2);
        panel.add(jButtonAposta3);
        panel.add(jButtonSair);
        this.getContentPane().add(panel);
        frame.add(panel);
    }

    private void aposta1() {
        ImageIcon icon = new ImageIcon("sorteioimagem.png");
        Object numeroApostado = JOptionPane.showInputDialog
                (null, "Digite um número de 0 a 100", "Aposta 1",
                        JOptionPane.INFORMATION_MESSAGE, icon, null, "");
        int numeroApostadoInt = Integer.parseInt(numeroApostado.toString());
        Random random = new Random();
        int numeroSorteado = random.nextInt(101);
        if(numeroApostadoInt == numeroSorteado) {
            JOptionPane.showMessageDialog(null, "Você ganhou R$1.000,00",
                    "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon);
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu, o número sorteado foi: " + numeroSorteado,
                    "Aposta 1", JOptionPane.INFORMATION_MESSAGE, icon);
        }
    }

    private void aposta2() { //OBS.: COLOQUEI PARA GERAR LETRAS ALEATÓRIAS.
        Random random = new Random();
        char letraSorteada = (char) (random.nextInt(26) + 'A'); //Gera uma letra Aleatória.
        Object letraApostada = JOptionPane.showInputDialog
                (null, "Digite uma letra", "Aposta 2",
                        JOptionPane.INFORMATION_MESSAGE, null, null, "");
        char letraApostadaChar = letraApostada.toString().charAt(0);
        if(Character.toUpperCase(letraApostadaChar) == letraSorteada) {
            JOptionPane.showMessageDialog(null, "Você ganhou R$500,00 reais",
                    "Aposta 2", JOptionPane.INFORMATION_MESSAGE, null);
        } else {
            JOptionPane.showMessageDialog(null, "Você perdeu, a letra sorteada foi: " + letraSorteada,
                    "Aposta 2", JOptionPane.INFORMATION_MESSAGE, null);
        }
    }
    private void aposta3(){
        Object escolha = JOptionPane.showInputDialog (null,
        "Escolha 'Par' ou 'Ímpar' ", "Aposta 3",
        JOptionPane.INFORMATION_MESSAGE, null, new String[]{"Par", "Ímpar"}, "Par");

        if (escolha != null) {
            String escolhaString = escolha.toString();
            Random random = new Random();
            int numeroSorteado = random.nextInt(100) + 1; //irá sortear de 1 a 100

            if ((escolhaString.equals("Par") && numeroSorteado % 2 == 0) ||
                    (escolhaString.equals("Ímpar") && numeroSorteado % 2 != 0)) {
                JOptionPane.showInternalMessageDialog(null, "Você ganhou R$500,00",
                        "Aposta 3", JOptionPane.INFORMATION_MESSAGE);
            }else {
                JOptionPane.showInternalMessageDialog(null, "Você perdeu! " +
                        "o número sorteado foi: " + numeroSorteado, "Aposta 3",
                        JOptionPane.INFORMATION_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
        new LotoFacil();
    }
}
