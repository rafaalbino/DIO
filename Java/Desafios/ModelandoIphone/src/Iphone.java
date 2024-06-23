import funcoes.AparelhoTelefonico;
import funcoes.NavegadorInternet;
import funcoes.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{
    public static void main(String[] args) {
        Iphone iphone = new Iphone();

        System.out.println("Iniciando Iphone...");
        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Enemy - Imagine Dragons");

        iphone.ligar("5511912345678");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("https://www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();
    }   
}
