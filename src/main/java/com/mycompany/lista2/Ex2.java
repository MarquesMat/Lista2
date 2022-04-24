package com.mycompany.lista2;

import java.util.Scanner;

public class Ex2 {
    public static void aniversario (Pessoa pessoa, int n) {
        pessoa.idade += n;
    }
        
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        Scanner teclado = new Scanner(System.in);
        int n, idade;
        String nome;
        System.out.print("Insira o nome da pessoa: ");
        nome = teclado.next();
        System.out.print("Insira a idade inicial da pessoa: ");
        idade = teclado.nextInt();
        Pessoa.criarPessoa(pessoa, nome, idade);
        System.out.println ("\nDADOS INICIAIS:");
        Pessoa.imprimirPessoa(pessoa);
        System.out.print("Insira o numero aniversarios esta pessoa ja fez: ");
        n = teclado.nextInt();
        aniversario(pessoa, n);
        System.out.println ("\nDADOS ATUAIS:");
        Pessoa.imprimirPessoa(pessoa);
    }
}
