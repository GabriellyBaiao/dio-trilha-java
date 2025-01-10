import javax.swing.plaf.PanelUI;

public class ContaCorrente extends Conta {

    private double limite;

    public ContaCorrente(String numeroConta, Cliente cliente, double limite) {
        super(numeroConta, cliente);
        this.limite = limite;
    }


    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo() + limite){
            super.sacar(valor);
        }else {
            System.out.println("Saldo insuficiente ou valor excede o limite");
        }
    }

}
