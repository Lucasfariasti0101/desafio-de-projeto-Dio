import model.Cliente;
import model.Conta;
import model.ContaCorrente;
import model.ContaPoupanca;

public class Main {
    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.setName("Lucas Farias");

        Conta contaCorrente = new ContaCorrente(cliente);
        Conta contaPoupanca = new ContaPoupanca(cliente);


        contaCorrente.printExtratoConta();
        contaCorrente.depositar(350d);
        contaCorrente.printExtratoConta();
        contaCorrente.transferir(200d, contaPoupanca);
        contaPoupanca.printExtratoConta();
        contaCorrente.printExtratoConta();

    }
}
