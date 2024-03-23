package faustinho.estudojava.introducao;

public class A04Operadores {
    public static void main(String[] args) {
        // + - * /
        double n1 = 10;
        double n2 = 20;
        double resultado = n1 / n2;
        System.out.println(resultado);

        // % resto

        double resto = 21 % 2;
        System.out.println(resto);

        // < > <= >= == !=
        boolean isDezMaiorVinte = 10 > 20;
        boolean isDezMenorVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezDiferenteVinte = 10 != 20;
        boolean isDezMaiorIgualVinte = 10 >= 20;
        boolean isDezMenorIgualVinte = 10 <= 20;

        System.out.println(isDezMaiorVinte);
        System.out.println(isDezMenorVinte);
        System.out.println(isDezIgualVinte);
        System.out.println(isDezDiferenteVinte);
        System.out.println(isDezMaiorIgualVinte);
        System.out.println(isDezMenorIgualVinte);

        // && (and) || (or)
        int idade = 18;
        float salario = 2000f;
        boolean isComboBaladaSalarioMaior2000 = idade >= 18 && salario >= 2000;
        boolean isComboBaladaSalarioMenor2000 = idade < 18 && salario < 2000;

        System.out.println("isComboBaladaSalarioMaior2000 " + isComboBaladaSalarioMaior2000);
        System.out.println("isComboBaladaSalarioMenor2000 " + isComboBaladaSalarioMenor2000);


        double contaCorrente = 2000;
        double contaPoupanca = 6000;
        double valorSomAutomotivo = 4500;
        boolean isSomAutomotivoCompravel = contaCorrente >= valorSomAutomotivo || contaPoupanca >= valorSomAutomotivo;

        System.out.println("Consigo comprar o som automotivo com o dinheiro que tenbho na conta? " +isSomAutomotivoCompravel);

        // += *= -= /= %=
        int bonus = 1000;
        bonus += 500; //bonus = bonus + 500;
        bonus -= 500;
        bonus *= 5;
        bonus /= 5;
        bonus %= 2;

        System.out.println(bonus);

        // ++ --
        int contador = 10;
        contador += 1; // contador++;
        contador--;



        System.out.println(++contador);



    }
}
