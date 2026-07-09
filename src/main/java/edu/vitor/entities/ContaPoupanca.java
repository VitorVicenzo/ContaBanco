package edu.vitor.entities;

import edu.vitor.interfaces.Conta;

public class ContaPoupanca implements Conta {

    private Integer numero;
    private String agencia;
    private String nomeCliente;
    private Float saldo;

    public ContaPoupanca(Integer numero, String agencia, String nomeCliente) {
        this.numero = numero;
        this.agencia = agencia;
        this.nomeCliente = nomeCliente;
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

    public Float getSaldo() {
        return saldo;
    }

    @Override
    public void deposito(Float valorDeposito) {
        saldo += valorDeposito;
    }

    @Override
    public void saque(Float valorSaque) {
        saldo -= valorSaque;
    }

    @Override
    public void transferencia(Float valorTransferencia) {
        saldo -= valorTransferencia;
    }

}
