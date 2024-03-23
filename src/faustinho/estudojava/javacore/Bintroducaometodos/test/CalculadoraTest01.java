package faustinho.estudojava.javacore.Bintroducaometodos.test;

import faustinho.estudojava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.somarDoisNumeros();
        System.out.println("Finalizando CalculadoraTest01");
        calculadora.subtrairDoisNumeros();
    }
}
