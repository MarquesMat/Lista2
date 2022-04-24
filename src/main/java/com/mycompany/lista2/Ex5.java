package com.mycompany.lista2;

import java.util.Scanner;

public class Ex5 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        Televisao tv = new Televisao();
        int n;
        System.out.println("ESTADO INICIAL DA TV:");
        Televisao.estado (tv);
        System.out.print ("\nSelecione LIGAR(1) ou DESLIGAR(0) TV: ");
        n = teclado.nextInt();
        Televisao.ligar(tv, n);
        System.out.print ("Digite o canal especifico ou digite -1 para mudar manualmente: ");
        n = teclado.nextInt();
        if (n != -1) Televisao.mudarCanal(tv, n);
        else {
            System.out.print ("Selecione PROXIMO(1) ou ANTERIOR(0): ");
            n = teclado.nextInt();
            if (n != 0) Televisao.canalProximo(tv);
            else Televisao.canalAnterior(tv);
        }        
        System.out.print ("Selecione AUMENTAR(1) ou DIMINUIR(0) volume: ");
        n = teclado.nextInt();
        Televisao.alterarVolume(tv, n);
        System.out.print ("Selecione SILENCIAR(1) ou DESSILENCIAR(0): ");
        n = teclado.nextInt();
        Televisao.silenciar(tv, n);
        System.out.println("\nESTADO ATUAL DA TV:");
        Televisao.estado (tv);
    }
}