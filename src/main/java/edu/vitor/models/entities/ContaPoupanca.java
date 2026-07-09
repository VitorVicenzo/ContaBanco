package edu.vitor.models.entities;

import edu.vitor.models.interfaces.Conta;

public class ContaPoupanca implements Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Double saldo = 0.0;
    private String tipoConta;

    public ContaPoupanca(Integer numero, String agencia, String nomeCliente, String tipoConta) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
        this.tipoConta = tipoConta;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public Integer getNumero() {
        return numero;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public Double getSaldo() {
        return saldo;
    }

    private void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void deposito(Double valorDeposito) {
        setSaldo(saldo += valorDeposito);
    }

    @Override
    public void saque(Float valorSaque) {
        setSaldo(saldo -= valorSaque);
    }

    @Override
    public void transferencia(Float valorTransferencia) {
        setSaldo(saldo -= valorTransferencia);
    }

}
