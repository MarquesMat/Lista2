package com.mycompany.lista2;

import java.util.Scanner;

public class Ex4 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Casa casa = new Casa();
        PortasCasa porta1 = new PortasCasa(), porta2 = new PortasCasa(), porta3 = new PortasCasa();
        String cor;
        System.out.print("\nEscolha a cor da casa: ");
        cor = teclado.next();
        Casa.pintarCasa (casa, cor);
        Casa.localPortas(porta1, 1);
        Casa.localPortas(porta2, 2);
        Casa.localPortas(porta3, 3);
        Casa.estadoPortas(porta1, porta1.local);
        Casa.estadoPortas(porta2, porta2.local);
        Casa.estadoPortas(porta3, porta3.local);
        Casa.quantasPortasEstaoAbertas(porta1.estado, porta2.estado, porta3.estado);
    }
}
