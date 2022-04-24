package com.mycompany.lista2;

import java.util.Scanner;

public class Ex3 {
    
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Porta porta = new Porta();
        int estado;
        String cor, dimensoes;
        Porta.imprimirPorta(porta); //porta antes das alterações
        System.out.print("\n\nSelecione ABRIR(1) OU FECHAR(0) a porta: ");
        estado = teclado.nextInt();
        System.out.print("Selecione a nova cor: ");
        cor = teclado.next();
        System.out.print("Selecione as novas dimensoes: ");
        dimensoes = teclado.next();
        Porta.novaPorta(porta, estado, cor, dimensoes);
        Porta.imprimirPorta(porta); //porta depois das alterações
    }
}
