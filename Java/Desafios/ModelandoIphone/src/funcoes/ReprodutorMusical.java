package funcoes;

public interface ReprodutorMusical {
    default void tocar() {
        System.out.println("Reproduzindo música...");
    }
    
    default void pausar() {
        System.out.println("Música pausada.");
    }
    
    default void selecionarMusica(String musica) {
        System.out.println("Música selecionada: " + musica);
    }
}
