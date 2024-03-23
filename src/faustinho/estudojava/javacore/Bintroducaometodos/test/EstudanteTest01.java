package faustinho.estudojava.javacore.Bintroducaometodos.test;

import faustinho.estudojava.javacore.Bintroducaometodos.dominio.Estudante;
import faustinho.estudojava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTest01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Goku";
        estudante01.idade = 42;
        estudante01.sexo = 'M';

        estudante02.nome = "Hynata";
        estudante02.idade = 30;
        estudante02.sexo = 'F';

       impressora.imprime(estudante01);
       impressora.imprime(estudante02);


    }
}
