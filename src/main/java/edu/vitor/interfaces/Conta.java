package edu.vitor.interfaces;

public interface Conta {

    default void deposito(Float valorDeposito) {
        deposito(valorDeposito);
    }

    default void saque(Float valorSaque) {
        saque(valorSaque);
    }

    default void transferencia(Float valorTransferencia) {
        transferencia(valorTransferencia);
    }
}
