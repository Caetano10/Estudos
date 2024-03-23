package faustinho.estudojava.javacore.Bintroducaometodos.dominio;

public class ImpressoraEstudante {
    public void imprime (Estudante estudant){
        System.out.println("-----------------");
        System.out.println(estudant.nome);
        System.out.println(estudant.idade);
        System.out.println(estudant.sexo);

    }
}
