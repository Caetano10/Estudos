package faustinho.pagina1;

public class A14EstruturasDeRepeticao04 {
    // Dado o valor de um carro, descubra em quantas vezes ele pode ser parcelado
    // Condição valorParcela >= 1000
    public static void main(String[] args) {
        double valorCarro = 50000;
        for (int parcela = 1; parcela <= valorCarro ; parcela++) {
            double valorParcela = valorCarro / parcela;
            if (valorParcela < 1000){
                break;
            }
            System.out.println("Parcela "+parcela+ " R$"+valorParcela);
        }
    }
}
