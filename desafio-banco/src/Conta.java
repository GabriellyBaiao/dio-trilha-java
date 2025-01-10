public abstract class Conta implements IConta {

   private String numeroConta;
   private double saldo;
   private Cliente cliente;

    public Conta(String numeroConta, Cliente cliente) {
        this.numeroConta = numeroConta;
        this.cliente = cliente;
        this.saldo = 0.0;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado no valor de R$ " + valor);
        }else {
            System.out.println("Valor Inválido para depósito!");
        }
    }

    public void sacar(double valor){
        if(valor < 0 && valor <= saldo){
            saldo -= valor;
            System.out.println("Saque realizado no valor de: " + valor);
        }else {
            System.out.println("Saldo insuficiente ou inválido!");
        }
    }
}
