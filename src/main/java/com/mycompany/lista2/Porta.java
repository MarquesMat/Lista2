//Ex 3

package com.mycompany.lista2;

public class Porta {
    int estado = 0; //0 -> porta fechada ; 1 -> porta aberta
    String cor = "marrom", dimensoes = "1.0x2.1";
    
    public static void novaPorta(Porta porta, int estado, String cor, String dimensoes) {
        porta.cor = cor;
        porta.dimensoes = dimensoes;
        porta.estado = estado;
    }
    
    public static void estaAberta(int x) {
        if (x == 0) System.out.print("\nA PORTA ESTA FECHADA");
        else System.out.print("\nA PORTA ESTA ABERTA");
    }
    
    public static void imprimirPorta(Porta porta) {
        System.out.print("\n\nDIMENSOES: "+porta.dimensoes);
        System.out.print("\nCOR: "+porta.cor);
        Porta.estaAberta (porta.estado);
    }
}
