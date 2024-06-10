import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double preco, preco_novo,meses;
        int escolha;

        System.out.println("Selecione o preço do produto");
        preco = in.nextDouble();
        System.out.println("Menu");
        System.out.println("1.Débito");
        System.out.println("2.PIX");
        System.out.println("3.Crédito");
        System.out.println("Escolha umas das formas de pagamentos: ");
        escolha = in.nextInt();

        switch (escolha) {
            case 1://Débito
                System.out.println("Selecionado Débito: 5% de desconto");
                preco_novo = preco * 0.95;
                System.out.println("O preco do produto final é: R$" + preco_novo);
                break;

            case 2://PIX;
                System.out.println("Selecionado Pix: 10% de desconto");
                preco_novo = preco * 0.90;
                System.out.println("O preco do produto final é: R$" + preco_novo);
                break;

            case 3://Crédito;
                System.out.println("Selecionado Crédito: 2% de juros até 4 meses ou 5% até mais de 4 meses de parcelamento");
                System.out.println("Selecione quantos meses de parcelamento: ");
                meses = in.nextDouble();
                if (meses <= 4) {
                    System.out.println("Selecionado " + meses+ " meses");
                    preco_novo = preco * 1.02;
                    System.out.println("Preço final é " + preco_novo);
                } else {
                    System.out.println("Selecionado " + meses +" meses");
                    preco_novo = preco * 1.05;
                    System.out.println("Preço final é " + preco_novo);
                }
            }

        }
    }