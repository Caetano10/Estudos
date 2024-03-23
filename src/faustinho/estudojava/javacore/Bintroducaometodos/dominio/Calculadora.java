package faustinho.estudojava.javacore.Bintroducaometodos.dominio;

public class Calculadora {
    public void somarDoisNumeros() {
        System.out.println(10 + 5);
    }

    public void subtrairDoisNumeros() {
        System.out.println(23 - 2);
    }

    public void multiplicarDoisNumeros(int num1, float num2) {
        System.out.println(num1 * num2);
    }

    public double dividirDoiNumeros(double num1,double num2){
        if (num2 == 0){
            return 0;
        }
        return num1/num2;
    }

    public void alteraDoisNumeros(int num1, int num2){
        num1 = 99;
        num2 = 33;
        System.out.println("Dentro do altaera dois numeros");
        System.out.println("num1 "+num1);
        System.out.println("num2 "+num2);
    }

}
