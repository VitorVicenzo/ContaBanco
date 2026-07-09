package edu.vitor.models.interfaces;

public interface Conta {

    default void deposito(Double valorDeposito) {
        deposito(valorDeposito);
    }

    default void saque(Float valorSaque) {
        saque(valorSaque);
    }

    default void transferencia(Float valorTransferencia) {
        transferencia(valorTransferencia);
    }
}
