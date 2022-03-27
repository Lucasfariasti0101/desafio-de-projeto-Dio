package model;

public abstract class Conta implements ContaInterface{

    private static final int AGENCIA_PADRAO = 1847;
    private static int SEQUQENCIA_NUM = 1;

    protected int agencia;
    protected int numero;
    protected double saldo = 0.0;
    protected Cliente cliente;

    public Conta(Cliente cliente) {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUQENCIA_NUM++;
        this.cliente = cliente;
    }

    @Override
    public void sacar(double valor) {
        this.saldo -= valor;
    }

    @Override
    public void depositar(double valor) {
        this.saldo += valor;
    }

    @Override
    public void transferir(double valor, Conta conta) {
        sacar(valor);
        conta.depositar(valor);
    }

    @Override
    public void printExtratoConta() {
        System.out.println("-----------------------");
        System.out.println("Cliente: " + this.cliente.getName());
        System.out.println("Conta: " + this.numero);
        System.out.println("Agencia: " + this.agencia);
        System.out.format("\nSaldo: %.2f \n", this.saldo);
        System.out.println("-----------------------");
    }

    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public Double getSaldo() {
        return saldo;
    }
}
