package faustinho.estudojava.introducao;

public class A11EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int contagem = 0;
        while (contagem < 10) {
            contagem++;
            System.out.println("while " + contagem);
        }
        contagem = 0;
        do {
            System.out.println("do while " + ++contagem);
        } while (contagem < 10);

        for (int i=0; i < 10 ; i++) {
            System.out.println("for " + i);
        }
    }
}
