import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int entrada;
        Heroi heroi = new Heroi();
        Monstro monstro = new Monstro();

        heroi.getStatus();
        monstro.getStatus();
        //System.out.println("14.Posição Heroi: "+Heroi.getPosicao());//Visualização
        //System.out.println("15.Posição Monstro: "+monstro.getPosicao());//Visualização
        System.out.println("A distancia entre Você e o monstro é de " + Math.abs(Heroi.getPosicao() - monstro.getPosicao()));
        System.out.println("Vida do HEROI: " + heroi.getVida() + "hp e MONSTRO: " + monstro.getVida() + "hp\n");

        while (true) {
            //Ação MOnstro
            Heroi.mostrarDado();
                if (Math.abs(monstro.getPosicao() - Heroi.getPosicao()) >= 4) {
                    monstro.setInvestida();
                    monstro.terminalInvestida();
                } else {
                    monstro.setDano();
                    heroi.setSofrerDano(monstro.setDano());
                    monstro.terminalDano();

            }
            System.out.println("A distancia entre Você e o monstro é de " + Math.abs(Heroi.getPosicao() - monstro.getPosicao()));
            System.out.println("Vida do HEROI: " + heroi.getVida()+ "hp e MONSTRO: " + monstro.getVida() + "hp\n");

            //System.out.println("25.Posição Heroi: "+Heroi.getPosicao());//Visualização
            //System.out.println("26.Posição Monstro: "+monstro.getPosicao());//Visualização

            if (heroi.getVida() <= 0 || monstro.getVida() <= 0) {
                break;
            }
            //Ação Heroi
            System.out.println("SUA AÇÃO:\n1. Causar Dano\n2. Afastar com Salto");
            entrada = in.nextInt();
            switch (entrada) {
                case 1:
                    Heroi.mostrarDado();
                    Heroi.setDano();
                    monstro.setVidaAtual(Heroi.setDano());
                    heroi.terminalDano();
                    System.out.println(" ");
                    break;
                case 2:
                    Heroi.mostrarDado();
                    Heroi.setPosicao();
                    heroi.terminalSalto();
                    System.out.println(" ");
                    break;
                default:
                    System.out.println("Ação inválida. Tente novamente.");
            }
            if (heroi.getVida() <= 0 || monstro.getVida() <= 0) {
                break;
            }
            System.out.println("================================");
        }
        if (heroi.getVida() <= 0)
            System.out.println("HEROI MORREU");
        else if (monstro.getVida() <= 0)
            System.out.println("MONSTRO MORREU");
    }
}