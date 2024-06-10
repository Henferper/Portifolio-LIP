public class Arquivo {
    private static String nomeArquivo;
    private static String conteudo;

    public static String getNome(){
        return nomeArquivo;
    }

    public static void setNome(String nome){
        nomeArquivo = nome;
    }

    public static void getStatus(){
        System.out.println("Nome: " + getNome());
        System.out.println("Tamanho: " + getTamanho() + " bytes ou " + getTamanho() * 8 + " bits");
        System.out.println("Conteudo:\n" + getConteudo());
    }

    public static void setConteudo(String adicionar){
        if (conteudo == null) {
            conteudo = adicionar;
        } else {
            conteudo += "\n";
            conteudo += adicionar;
        }
    }

    public static String getConteudo(){
        return conteudo;
    }

    public static int getTamanho(){
        if (conteudo == null) {
            return 0;
        }
        return conteudo.length();
    }
}
