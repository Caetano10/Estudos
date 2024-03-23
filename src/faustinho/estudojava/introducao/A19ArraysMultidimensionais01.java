package faustinho.estudojava.introducao;

public class A19ArraysMultidimensionais01 {
    public static void main(String[] args) {
        //Arrays dentro de Arrays
        int [][] dias = new int[3][3];
        dias [0][0] = 00;
        dias [0][1] = 01;
        dias [0][2] = 02;

        dias [1][0] = 10;
        dias [1][1] = 11;
        dias [1][2] = 12;

        dias [2][0] = 20;
        dias [2][1] = 21;
        dias [2][2] = 22;

        for (int i = 0; i < dias.length ; i++) {
            for (int j = 0; j < dias[i].length ; j++) {
                System.out.println(dias[i][j]);
            }

        }
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");
        System.out.println("-------------------------------------");

        for (int[] arrayBase:  dias){
            for (int num: arrayBase)
            System.out.println(num);
        }

    }
}
