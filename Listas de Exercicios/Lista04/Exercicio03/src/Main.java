import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int [] vector = {0,1,2,3,4,5,6,7,8,9};
        int i,value;
        boolean found = false;
        System.out.println("Digite um valor: ");
        value = in.nextInt();

        for(i=0;i < vector.length;i++){
            if (vector[i]==value){
                found = true;
                break;
            }
        }
        if (found){
            System.out.println("Valor "+value+" Encontrado no indice: "+i);
        }else {
            System.out.println("Valor não encontrado");
        }
    }
}
