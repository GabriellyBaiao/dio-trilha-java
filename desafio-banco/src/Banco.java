import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> contas;

    public Banco() {
        this.contas = new ArrayList<>();
    }

    public void adicionarConta(Conta conta){
        if(conta != null){
            contas.add(conta);
            System.out.println("Conta adicionada com sucesso!");
        }else{
            System.out.println("Conta inválida");
        }
    }

    public IConta buscarConta(String numeroConta){
        for (IConta conta : contas) {
            if(conta.getNumeroConta().equals(numeroConta)){
                return conta;
            }
        }
        return null;
    }

}
