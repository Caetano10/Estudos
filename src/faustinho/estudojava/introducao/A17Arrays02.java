package faustinho.estudojava.introducao;

public class A17Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double 0
        // char '\u0000' '   '
        // boolean false
        // String null

        String [] nomes = new String [3];

        nomes [0] = "Lucas";
        nomes [1] = "Caetano";
        nomes [2] = "Silva";

        System.out.println(nomes[0]);
        System.out.println(nomes[1]);
        System.out.println(nomes[2]);


        int [] idade = new int [3];
        idade[0] = 10;
        idade[1] = 15;
        idade[2] = 20;

        //length serve para não ter que ficar trocando toda vez o numero de espaços que contem na arrays.
        for (int i = 0; i < idade.length ; i++) {
            System.out.println(idade[i]);

        }
    }
}
