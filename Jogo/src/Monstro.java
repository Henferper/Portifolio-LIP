public class Monstro {
    private String nome = "Hydra";
    private int vida = 110;
    private int dano = 12;
    private int investida = 3;
    private int alcance = 4;
    private int posicao = 10;
    public void getStatus() {
        System.out.println("\nNome: " + nome);
        System.out.println("Vida: " + vida + " hp");
        System.out.println("Dano: " + dano);
        System.out.println("Alcance: " + alcance);
        System.out.println("Investida: " + investida+"\n");}
    public int getPosicao() {
        return posicao;}
    public int setInvestida() {
        this.posicao -= getInvestida();
        return posicao;}
    public int getInvestida() {
        if (Heroi.dado >= 15) {
            return  investida = 6;
        } else {
            return investida = 3;}}
    public int getDano(){
        return setDano();
    }
    public int setDano() {
        if (Heroi.dado >= 15)
            return  15;
        else
            return  12;}
    public void terminalDano() {
        if (Heroi.dado >= 15) {
            System.out.println("O monstro acertou com golpe crítico " + setDano());
        } else {
            System.out.println("O monstro acertou um golpe de " + setDano());}}
    public void terminalInvestida() {
        if (Heroi.dado >= 15) {
            System.out.println("O monstro deu uma Investida Poderosa de " + getInvestida());
        } else {
            System.out.println("O monstro deu uma Investida de " + getInvestida());}}
    public int getVida() {
        return vida;
    }
    public int setVidaAtual(int danoHeroi) {
        vida -= danoHeroi;
        return vida;}}