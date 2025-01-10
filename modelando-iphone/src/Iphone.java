public class Iphone extends AparelhoTelefonico implements NavegadorInternet, ReprodutorMusical{

    private String modelo;

    public void ligar(String numero){

    }

    public void atender(){

    }

    public void iniciarCorreioDeVoz(){

    }

    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibir página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada..");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página Atualizada");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música..");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
    }

    @Override
    public void selecionarMusica(String nomeDaMusica) {
        System.out.println("Música selecionada: " + nomeDaMusica);
    }
}
