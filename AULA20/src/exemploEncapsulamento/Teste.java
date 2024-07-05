package exemploEncapsulamento;

import java.util.Scanner;

public class Teste {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Qual o nome: ");
        String nome = ler.next();
        System.out.println("Qual o sobrenome: ");
        String sobrenome = ler.next();
        Pessoa p1 = new Pessoa(nome, sobrenome);
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Sobrenome: "+p1.getSobrenome());

        //se precisar alterar alguma informação
        System.out.println("Qual o nome: ");
        nome = ler.next();
        System.out.println("Qual o sobrenome: ");
        sobrenome = ler.next();
        p1.setNome(nome);
        p1.setSobrenome(sobrenome);
        System.out.println("Nome: "+p1.getNome());
        System.out.println("Sobrenome: "+p1.getSobrenome());
    }
}
