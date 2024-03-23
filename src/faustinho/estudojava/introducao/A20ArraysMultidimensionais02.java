package faustinho.estudojava.introducao;

public class A20ArraysMultidimensionais02 {
    public static void main(String[] args) {

        int [][] arrayInt1 = new int[3][];
        arrayInt1[0] = new int[2];
        arrayInt1[1] = new int[5];
        arrayInt1[2] = new int[8];

        for (int[] arrayBase: arrayInt1) {
            System.out.println("\n----------");
            for (int num : arrayBase) {
                System.out.print(num + " ");
            }
        }

         int [] array = {1,2,3};

         int [][] arrayInt2 = new int[3][];
         arrayInt2[0] = new int[2];
         arrayInt2[1] = array;
         arrayInt2[2] = new int[]{1,2,3,4,5,6};

         for (int[] arrayBase2: arrayInt2){
             System.out.println("\n|||||||||||||||||||");
             for (int num2: arrayBase2 ){
                 System.out.print(num2 + " ");

             }
         }


    }
}
