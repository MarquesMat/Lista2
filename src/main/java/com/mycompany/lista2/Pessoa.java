//Ex 2

package com.mycompany.lista2;

public class Pessoa {
    String nome;
    int idade;
    
    public static void criarPessoa (Pessoa pessoa, String nome, int idade) {
        pessoa.nome = nome;
        pessoa.idade = idade;
    }
    
    public static void imprimirPessoa (Pessoa pessoa) {
        System.out.printf ("NOME: %s\n", pessoa.nome);
        System.out.printf ("IDADE: %d\n\n", pessoa.idade);
    }
    
    public static void aniversarios (Pessoa pessoa, int n) {
        pessoa.idade += n;
    }
}
