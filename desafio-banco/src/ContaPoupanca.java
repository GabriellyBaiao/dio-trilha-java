public class ContaPoupanca extends Conta {


    public ContaPoupanca(String numeroConta, Cliente cliente) {
        super(numeroConta, cliente);
    }

    @Override
    public void sacar(double valor) {
        if(valor > 0 && valor <= getSaldo()){
            super.sacar(valor);
        }else {
            System.out.println("Saldo insuficiente para poupança ou valor excede o limite");
        }
    }
}
