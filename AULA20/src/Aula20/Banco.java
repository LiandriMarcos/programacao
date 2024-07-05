package Aula20;

import java.util.Scanner;

public class Banco {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.print("Entre com o nome do titular: ");
        String titular = ler.next();
        System.out.print("Entre com o deposito inicial: ");
        float valor = ler.nextFloat();
        Conta c1 = new Conta(titular, valor);
        System.out.println("Conta cadastrada, obteve o id: "+c1.identificador);
        //Criando outra conta
        Conta c2 = new Conta("Jonas", 10);
        c1.nomeBanco = "Banco cimol";
        System.out.println("Nome banco c1: "+c1.nomeBanco);
        System.out.println("Nome banco c2: "+c2.nomeBanco);
        Conta.nomeBanco = "Teste";
        System.out.println("Nome banco c1: "+c1.nomeBanco);
        System.out.println("Nome banco c2: "+c2.nomeBanco);
    }
}
