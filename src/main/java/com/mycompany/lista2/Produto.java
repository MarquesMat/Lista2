//Ex 7

package com.mycompany.lista2;

public class Produto {
    String nome;
    double preco;
    int qtd_estoque;
    
    public static void novoProduto (Produto produto, String nome, double preco, int qtd) {
        produto.nome = nome;
        produto.preco = preco;
        produto.qtd_estoque = qtd;
    }
}
