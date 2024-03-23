package faustinho.estudojava.javacore.Bintroducaometodos.test;

import faustinho.estudojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.dividirDoiNumeros(10,2);
        System.out.println(resultado);
    }
}
