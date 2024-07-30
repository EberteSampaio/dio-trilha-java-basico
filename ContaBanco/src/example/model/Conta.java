package example.model;

public class Conta {
    private int     numero;
    private String  agencia;
    private String  nomeCliente;
    private double  saldo;

    public Conta(){

    }

    public Conta(int numeroConta, String agenciaConta, String nomeClienteConta, double saldo){
        this.setNumero(numeroConta);
        this.setAgencia(agenciaConta);
        this.setNome(nomeClienteConta);
        this.setSaldo(saldo);
    }

    public void setNumero(int numeroConta){
        this.numero = numeroConta;
    }

    public void setAgencia(String agenciaConta){
        this.agencia = agenciaConta;
    }

    public void setNome(String nomeCliente){
        this.nomeCliente = nomeCliente;
    }

    public void setSaldo(double saldoCliente){
        this.saldo = saldoCliente;
    }

    public int getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public double getSaldo() {
        return saldo;
    }

    
}
