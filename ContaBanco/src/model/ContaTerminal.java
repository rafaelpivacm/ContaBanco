package model;

public class ContaTerminal {
    private int Numero;
    private String Agencia;
    private String NomeCliente;
    private Double Saldo;

    public ContaTerminal() {
    }
    
    public ContaTerminal(int numero, String agencia, String nomeCliente, Double saldo) {
        this.Numero = numero;
        this.Agencia = agencia;
        this.NomeCliente = nomeCliente;
        this.Saldo = saldo;
    }
    
    public int getNumero() {
        return Numero;
    }
    public void setNumero(int numero) {
        Numero = numero;
    }
    public String getAgencia() {
        return Agencia;
    }
    public void setAgencia(String agencia) {
        Agencia = agencia;
    }
    public String getNomeCliente() {
        return NomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        NomeCliente = nomeCliente;
    }
    public Double getSaldo() {
        return Saldo;
    }
    public void setSaldo(Double saldo) {
        Saldo = saldo;
    }

}
