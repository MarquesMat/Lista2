package com.mycompany.lista2;

import java.util.Scanner;

public class Ex1 {
    public static void inserir_contatos (Agenda agenda, int n) {
        Scanner teclado = new Scanner(System.in);
        int i, idade, tel;
        String nome, end;
        for (i=0; i<n; i++) {
            System.out.printf("\nNome do contato %d: ",(i+1));
            nome = teclado.next();
            System.out.printf("Endereco do contato %d: ",(i+1));
            end = teclado.next();
            System.out.printf("Idade do contato %d: ",(i+1));
            idade = teclado.nextInt();
            System.out.printf("Telefone do contato %d: ",(i+1));
            tel = teclado.nextInt();
            agenda.qtdContatos++;
            agenda.addContato(nome, end, idade, tel, agenda.qtdContatos);
        }
    }
    
    public static void imprimir_contatos (Agenda agenda) {
        int i;
        for (i=0; i<=agenda.qtdContatos; i++) {
            System.out.printf("\n\nCONTATO %d", (i+1));
            System.out.printf("\nNOME: %s", agenda.contatos[i].nome);
            System.out.printf("\nTELEFONE: %d", agenda.contatos[i].tel);
            System.out.printf("\nIDADE: %d", agenda.contatos[i].idade);
            System.out.printf("\nENDERECO: %s", agenda.contatos[i].end);
        }
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Agenda agenda = new Agenda();
        int n;
        System.out.print("Quantos contatos voce gostaria de adicionar? ");
        n = teclado.nextInt();
        inserir_contatos(agenda, n);
        if (agenda.qtdContatos >= 0) imprimir_contatos(agenda);
        else System.out.print("\nAGENDA VAZIA");
    }
}
