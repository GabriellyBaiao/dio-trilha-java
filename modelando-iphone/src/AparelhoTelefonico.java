import javax.swing.plaf.PanelUI;

public class AparelhoTelefonico {
    public void redeMovelDisponivel(String operadora){
        System.out.println("Operadora disponível: " + operadora);
    }

    public void ligar(String nome){
        System.out.println("Ligando para: " + nome);
    }

    public void atender(){
        System.out.println("Atendendo a chamada...");
    }

    public void iniciarCorreioDeVoz(){
        System.out.println("Iniciando correio de voz.");
    }
}
