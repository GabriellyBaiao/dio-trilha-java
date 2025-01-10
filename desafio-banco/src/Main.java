public class Main {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("Gabrielly","1234545454");
        ContaCorrente cc = new ContaCorrente("00001", cliente1,45000);

        cc.depositar(5000);
        cc.sacar(300);
        cc.sacar(1500);

        Banco banco = new Banco();
        banco.adicionarConta(cc);

        IConta contaEncontrada = banco.buscarConta("0001");
        if(contaEncontrada != null){
            System.out.println("Conta encontrada: " + contaEncontrada.getNumeroConta());
        } else {
            System.out.println("Conta não encontrada");
        }

    }

}