//Ex 1

package com.mycompany.lista2;

public class Agenda {
    Contato[] contatos = new Contato[100];
    int qtdContatos = -1;
    
    void addContato(String nome, String end, int idade, int tel, int qtd) {
        Contato contato = new Contato();
        contato.nome = nome;
        contato.end = end;
        contato.idade = idade;
        contato.tel = tel;
        contatos[qtd] = contato;
    }
}
