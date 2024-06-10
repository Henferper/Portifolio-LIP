import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double velFin, velIni, tempo,aceleracao;
        System.out.println("Escreva um valor para a Velocidade Inicial em m/s: ");
        velIni = in.nextDouble();
        System.out.println("Escreva um valor para o tempo em segundos: ");
        tempo = in.nextDouble();
        System.out.println("Escreva um valor para a aceleração em m/s²: ");
        aceleracao = in.nextDouble();

        velFin = (velIni + aceleracao) * tempo ;

        System.out.println("O velocidade final é: " + velFin + "m/s");
    }
}