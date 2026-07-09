package edu.vitor.dio;

import edu.vitor.models.entities.ContaCorrente;

public class Main {
    public static void main(String[] args) {

        ContaCorrente contaCorrente = new ContaCorrente(1234,
        "1234",
        "Vitor",
        "Corrente");

        contaCorrente.deposito(1000.00);
        System.out.println(contaCorrente.getSaldo());
        contaCorrente.deposito(2000.0);
        System.out.println(contaCorrente.getSaldo());
        System.out.println();
    }
}