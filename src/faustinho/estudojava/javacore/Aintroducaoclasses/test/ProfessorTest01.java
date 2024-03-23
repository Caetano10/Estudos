package faustinho.estudojava.javacore.Aintroducaoclasses.test;

import faustinho.estudojava.javacore.Aintroducaoclasses.dominio.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nome = "Geromel";
        professor.idade = 95;
        professor.sexo = 'M';

        System.out.println("nome:"+ professor.nome  + " Idade:"+ professor.idade + " Sexo:"+ professor.sexo);
    }
}
