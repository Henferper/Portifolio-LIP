public class ContaBancaria {
    private String titular;
    private int numero;
    private static double saldo = 0;

    public static void depositar(double valor){
        if(valor>0)
            saldo+=valor;
    }
    public void sacar(double valor){
        if(valor >= saldo && valor < 0)
            saldo-=valor;
    }
    public double getSaldo(){
        return this.saldo;
    }
    public void setTitular(String titular){
        this.titular = titular;
    }
    public int setNumero(int numero){
        return this.numero = numero;
    }
    public void terminalSaque(double valor){
        if(valor > saldo)
            System.out.println("SAQUE INVÁLIDO");
    }
}
