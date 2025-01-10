public class Main {
    public static void main(String[] args) {

        Iphone iphone =  new Iphone();
        iphone.ligar("11987458366");
        iphone.atender();
        iphone.iniciarCorreioDeVoz();

        iphone.adicionarNovaAba();
        iphone.exibirPagina("https://github.com/GabriellyBaiao");
        iphone.atualizarPagina();

        iphone.selecionarMusica("O Mundo é um Moinho - Cartola");
        iphone.tocar();
        iphone.pausar();
    }
}