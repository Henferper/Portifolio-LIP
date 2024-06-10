import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);

        String nomeArquivo,texto;
        int opcao = 0, tamanho;
        boolean criarArquivo = false;

        System.out.println("Escolha o nome do ARQUIVO:");
        nomeArquivo = in.nextLine();
        Arquivo.setNome(nomeArquivo);

        while (opcao<7) {
            System.out.println("ESCOLHA as OPÇÕES:");
            System.out.println("1.MUDAR NOME DO ARQUIVO");
            System.out.println("2.VERIFIQUE OS DADOS DO ARQUIVO E TAMANHO");
            System.out.println("3.ADICIONE ALGO AO ARQUIVO");
            System.out.println("4.EDITE ALGO DO ARQUIVO");
            System.out.println("5.REMOVER ALGO DO ARQUIVO");
            System.out.println("6.LIMPAR ARQUIVO COMPLETAMENTE");
            System.out.println("0.ENCERRAR PROGRAMA");
            opcao = in.nextInt();

            switch (opcao) {
                case 1:
                    System.out.println("Reescreva o nome do arquivo");
                    in.nextLine();
                    nomeArquivo = in.nextLine();
                    Arquivo.setNome(nomeArquivo);
                    System.out.println(" ");
                    break;

                case 2:
                    Arquivo.getStatus();
                    System.out.println(" ");
                    break;
                case 3:
                    System.out.println("Escreva para adicionar");
                    in.nextLine();
                    texto = in.nextLine();
                    Arquivo.setConteudo(texto);
                    System.out.println(" ");
                    break;

                case 4:
                    break;
                case 5:
                    break;
                case 6:
                    break;
                case 7:
                    break;
                default:
                    break;
            }
        }
        System.out.println("\nPROGRAMA ENCERRADO");
    }
}