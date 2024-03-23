package faustinho.estudojava.javacore.Aintroducaoclasses.test;

import faustinho.estudojava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "Fiat";
        carro1.modelo = "Palio";
        carro1.ano = 1997;

        carro2.nome = "Chevrolet";
        carro2.modelo = "Cruze";
        carro2.ano = 2014;

        System.out.println("Nome:" + carro1.nome + "  Modelo:" + carro1.modelo + "  Ano:" + carro1.ano);
        System.out.println("Nome:" + carro2.nome + "  Modelo:" + carro2.modelo + "  Ano:" + carro2.ano);


    }
}
