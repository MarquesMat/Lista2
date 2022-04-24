package com.mycompany.lista2;

public class Ex6 {
    public static void main(String[] args) {
        Baralho baralho = new Baralho();
        int i, j;
        String[] naipes = new String[4];
        naipes[0] = "copas";
        naipes[1] = "espadas";
        naipes[2] = "ouros";
        naipes[3] = "paus";
        for (i=0; i<4; i++) {
            for (j=1; j<= 13; j++) {
                Carta carta = new Carta();
                carta.numero = j;
                carta.naipe = naipes[i];
                Baralho.addCarta(baralho, carta);
            }
        }
        Baralho.imprimirBaralho(baralho);
    }
}
