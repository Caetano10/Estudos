package faustinho.estudojava.introducao;

public class A06EstruturasCondicionais02 {
    public static void main(String[] args) {
        // idade < 15 infantil
        // idade >=15 && idade < 18 juvenil
        // idade > 18 adulto
        int idade = 22;
        String categoria;


        if (idade < 15){
            System.out.println("infantil");

        } else if (idade >= 15 && idade < 18) {
            System.out.println("juvenil");

        } else {
            System.out.println("adulto");
        }


        if (idade < 15){
            categoria = "infantil";

        } else if (idade >= 15 && idade < 18) {
            categoria = "juvenil";

        } else {
            categoria = "adulto";
        }
        System.out.println(categoria);
    }
}
