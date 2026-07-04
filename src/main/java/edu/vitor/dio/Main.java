package edu.vitor.dio;

import java.util.Locale;
import java.util.Scanner;

import edu.vitor.entities.ContaTerminal;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Digite seu nome !");
        String nomeCliente = sc.nextLine();
        System.out.println("Digite o número da sua conta !");
        Integer numero = sc.nextInt();
        System.out.println("Digite o número da sua agência !");
        String agencia = sc.next();
        System.out.println("Digite seu saldo !");
        Float saldo = sc.nextFloat();

        ContaTerminal contaTerminal = new ContaTerminal(numero, agencia, nomeCliente, saldo);

        System.out.println("Olá ".concat(contaTerminal.getNomeCliente()) 
        + ", obrigado por criar uma conta em nosso banco, sua agência é ".concat(agencia) 
        + ", conta ".concat(String.valueOf(contaTerminal.getNumero())) 
        + " e seu saldo ".concat(String.valueOf(contaTerminal.getSaldo()))
        + " já está disponível para saque.");
    }
}