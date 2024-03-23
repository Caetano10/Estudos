package faustinho.estudojava.introducao;

public class A13EstruturasDeRepeticao03 {
    // Imprima os primeiros 25 numeros de um dado valor. Por exemplo, 50
    public static void main(String[] args) {
        int valorMAx = 50;
        for (int i = 0; i < valorMAx ; i++) {
            if (i > 25){
                break;
            }
            System.out.println(i);
        }
    }
}
