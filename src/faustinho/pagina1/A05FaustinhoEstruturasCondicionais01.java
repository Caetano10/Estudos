package faustinho.pagina1;

public class A05FaustinhoEstruturasCondicionais01 {
    public static void main(String[] args) {

        int idade = 15;
        boolean isPodeComprarAlcool = idade >= 18;

        if (isPodeComprarAlcool){
            System.out.println("Pode comprar bebida alcolica");
        } else {
            System.out.println("Não pode comprar bebida alcolica");
        }

        if (! isPodeComprarAlcool){ // if (isPodeComprarAlcool == false)
            System.out.println("Não pode comprar bebida alcolica");
        }

    }
}
