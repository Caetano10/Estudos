package faustinho.pagina1;

public class A08FaustinhoEstruturasCondicionais04 {
    public static void main(String[] args) {
        double salario = 70000;
        double taxa1 = salario * 0.097;
        double taxa2 = salario * 0.3735;
        double taxa3 = salario * 0.4950;
        


        if (salario <= 34712){
            System.out.println(taxa1);
            
        } else if (salario >= 34713 && salario <= 68507) {
            System.out.println(taxa2);
            
        } else {
            System.out.println(taxa3);
        }
    }
}
