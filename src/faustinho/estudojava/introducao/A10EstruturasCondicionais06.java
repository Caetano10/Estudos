package faustinho.estudojava.introducao;

public class A10EstruturasCondicionais06 {
    public static void main(String[] args) {
        //Utilizandp switch e dados valores de 1 a 7, imprima se é dia util ou final de semana
        //Considerando domingo como 1

        byte dia = 5;

        switch (dia){
            case 1:
            case 7:
                System.out.println("Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia utíl");
                break;
            default:
                System.out.println("Valor inválido");
        }


    }
}
