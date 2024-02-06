package faustinho.pagina1;

public class A12EstruturasDeRepeticao02 {
    public static void main(String[] args) {
        //Contar todos os numeros pares de 0 até 1000000

        for (int i = 0; i <= 1000000; i++) {
            if (i % 2 == 0) {
                System.out.println("Par " + i);
            }
        }
    }
}
