package faustinho.estudojava.introducao;

public class A18Arrays03 {
    public static void main(String[] args) {
        //Formas de declarar uma array
        int [] numero = new int[4];
        int [] numero2 = {1,2,3,4};
        int [] numero3 = new int[]{1,2,3,4,5};

        for (int i = 0; i < numero2.length ; i++) {
            System.out.println(numero2[i]);

        }

        for (int num : numero3){
            System.out.println(num);
        }

    }
}
