import java.io.IOException;

public class Teste{
    public static void main(String [] args) throws IOException{
        System.out.println("Olá Mundo!");
        char ch;
        ch = 'x';
        System.out.println("ch contains" + ch);
        ch++; //incrementa ch
        System.out.println("ch is now" + ch);
        ch = 90; // da o ch o valor z
        System.out.println("ch is now" + ch);

        byte tipoByte = 127;
        short tipoShort = 32767;
        char tipoChar = 'C';
        float tipoFloat = 2.6f;
        double tipoDouble = 3.59;
        int tipoInt = 2147483647;
        long tipoLong = 9223372036854775807L;
        boolean tipoBooleano = true;
        System.out.println("Valor do tipoByte= " + tipoByte);
        System.out.println("Valor do tipoShort= " + tipoShort);
        System.out.println("Valor do tipoChar= " + tipoChar);
        System.out.println("Valor do tipoFloat= " + tipoFloat);
        System.out.println("Valor do tipoDouble= " + tipoDouble);
        System.out.println("Valor do tipoInt = " + tipoInt);
        System.out.println("valor do tipoLong= " + tipoLong);
        System.out.println("Valor do tipoBooleano= " + tipoBooleano);

        //Demonstra seguências de escape em strings.
        System.out.println("\nFirst line\nsecond line");
        System.out.println("A\tB\tC");
        System.out.println("D\tE\tF\n");

        //Demonstra valores booleanos.
        boolean b;
        b = false;
        System.out.println("b is " + b);
        b = true;
        System.out.println("b is" + b);
        //Um valor booleano pode controlar a instrução if.
        if (b) System.out.println("This is executed. ");
        b = false;
        if (b) System.out.println("This is not executed. ");
        //O resultado de um operador relacional é um valor booleano.
        System.out.println("10 > 9 is " + (10 > 9));

        int count = 10; //dá a count um valor inicial igual a 10
        char chr = 'X'; // inicializa chr com a letra X
        float f = 1.2f; // f é inicializada com 1,2

        //Demonstra o escopo de bloco.
        int m; //conhecida pelo código de main()
        m = 10;
        if (m == 10) {//inicia novo escopo
            int n = 20; // conhecida apenas nesse bloco
            // tanto m quanto n são conhecidas aqui.
            System.out.println("m and n: " + m + " " + n);
            m = n * 2;
        }

        //n = 100;; // Erro! não é conhecida aqui
        // m ainda é conhecida aqui.
        System.out.println(" m is " + m);

        //Demonstra o tempo de vida de uma varíavel.
        for (int i = 0; i < 3; i++){
            int j = -1; // y será inicializada sempre que entramos no bloco.
            System.out.println("j is. " + j); // essa linha sempre exibe -1
            j = 100;
            System.out.println("j is now: " + j);
        }

        //Demonstra os operadores relacionais e lógicos.
        int i, j; boolean b1, b2;
        i = 10;
        j = 11;
        if (i < j) System.out.println("\ni < j");
        if (i <= j) System.out.println("i <= j");
        if (i != j) System.out.println("i != j");
        if (i == j) System.out.println("this won't execute");
        if (i >= j) System.out.println("this won't execute");

        b1 = true;
        b2 = false;

    }


}