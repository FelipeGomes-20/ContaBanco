package org.example;

import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception{
        cadastrarCliente();
    }

    public static void cadastrarCliente() throws Exception{
        int numero;
        String agencia, nomeCliente;
        float saldo;

        Scanner leitor = new Scanner(System.in);
        Scanner leitorStr = new Scanner(System.in);

        System.out.println("Por favor, digite o Número da Agência !");
        numero = leitor.nextInt();

        System.out.println("Por favor, informe a Agência:");
        agencia = leitorStr.next();

        System.out.println("Por favor, informe o Nome Completo:");
        nomeCliente = leitorStr.next();

        System.out.println("Por favor, digite o saldo da conta(Exemplo: 000.00):");
        saldo = leitor.nextFloat();
        leitor.close();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo R$%.2f já está disponível para saque", nomeCliente, agencia, numero, saldo);

    }
}
