public interface IConta {

    void depositar(double valor);
    void sacar(double valor);
    String getNumeroConta();
    double getSaldo();
}
