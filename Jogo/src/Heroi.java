import java.util.Random;
public class Heroi {
    private String nome = "Percefone";
    private int vida = 40;
    private static int dano = 8;
    private static int salto = 4;
    private int alcance = 10;
    private static int posicao = 0;
    public static int dado;

    public void getStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("Vida: " + vida + " HP");
        System.out.println("Dano: " + dano);
        System.out.println("Alcance: " + alcance);
        System.out.println("Salto: " + salto);}
    public static int Dado() {
        Random random = new Random();
        dado = random.nextInt(20) + 1;
        return dado;}
    public static void mostrarDado() {
        Dado();
        System.out.println("DADO: " + dado);}
    public static int getPosicao() {
        return posicao;}
    public static int setPosicao() {
        return posicao -= setSalto();}
    public static int setSalto() {
        if (dado >= 15)
            return salto = 5;
        else
            return salto = 4;}
    public int getDano() {
        return dano;}
    public static int setDano() {
        if (dado >= 15)
            return dano = 12;
        else
            return dano = 8;}
    public int getSalto() {
        if (dado >= 15)
            return salto = 6;
        else
            return salto = 4;}
    public void terminalSalto() {
        if (dado >= 15) {
            System.out.println("Você saltou " + getSalto() + " com o Salto Aprimorado");
        } else {
            System.out.println("Você saltou " + getSalto());}}
    public void terminalDano() {
        if (setDano() >= 15) {
            System.out.println("Você causou Dano Crítico de " + getDano());
        } else {
            System.out.println("Você causou Dano de " + getDano());
        }}
    public int getVida() {
        return vida;}
    public int setSofrerDano(int danoMonstro) {
        vida -= danoMonstro;
        return vida;}}