import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double dinheiro, troco;
        int bebida;
        System.out.println("Insira o dinheiro: ");
        dinheiro = in.nextDouble();
        System.out.println( " ");
        System.out.println( "Menu");
        System.out.println("1.Café Expresso - R$ 0,50");
        System.out.println("2.Café Longo - R$ 1,00");
        System.out.println("3.Capuccino - R$ 2,50");
        System.out.println("4.Chocolate - R$ 2,00");
        System.out.println("Escolha umas das bebidas: ");
        bebida = in.nextInt();

        switch (bebida) {
            case 1://Café Expresso;
                if (dinheiro>=0.5){
                    System.out.println("Bebida escolhida: Café Expresso");
                    troco = dinheiro - 0.5;
                    System.out.println("Seu troco é R$" +troco);
                }
                else{
                    System.out.println("Dinheiro Insuficiente");
                }
                break;
            case 2://Café Longo;
                if (dinheiro>=1.0){
                    System.out.println("Bebida escolhida: Café Expresso");
                    troco = dinheiro - 1.0;
                    System.out.println("Seu troco é R$" +troco);
                }
                else{
                    System.out.println("Dinheiro Insuficiente");
                }
                break;
            case 3://Capuccino;
                if (dinheiro>=2.5){
                    System.out.println("Bebida escolhida: Café Expresso");
                    troco = dinheiro - 2.5;
                    System.out.println("Seu troco é R$" +troco);
                }
                else{
                    System.out.println("Dinheiro Insuficiente");
                }
                break;
            case 4://Café Expresso;
                if (dinheiro>=2.0){
                    System.out.println("Bebida escolhida: Café Expresso");
                    troco = dinheiro - 2.0;
                    System.out.println("Seu troco é R$" +troco);
                }
                else{
                    System.out.println("Dinheiro Insuficiente");
                }
                break;
        }

    }
}