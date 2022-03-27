package model;

public class ContaPoupanca extends Conta{

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void ImprimirExtrato() {
        System.out.println("***=== Conta Poupança ===***");
        printExtratoConta();
    }
}
