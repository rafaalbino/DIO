package funcoes;

public interface NavegadorInternet {
    default void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
    }
    
    default void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }
    
    default void atualizarPagina() {
        System.out.println("Página atualizada.");
    }
}
