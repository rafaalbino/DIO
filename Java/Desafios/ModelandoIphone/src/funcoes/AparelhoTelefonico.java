package funcoes;

public interface AparelhoTelefonico {
    default void ligar(String numero) {
        System.out.println("Ligando para " + numero + "...");
    }
    
    default void atender() {
        System.out.println("Atendendo chamada...");
    }
    
    default void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }
}
