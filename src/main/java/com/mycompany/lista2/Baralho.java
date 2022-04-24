//Ex 6

package com.mycompany.lista2;

public class Baralho {
    Carta[] cartas = new Carta[52];
    boolean embaralhado = false;
    int qtd = 0; //As cartas ainda não foram adicionadas
    
    public static void addCarta (Baralho baralho, Carta carta) {
        baralho.cartas[baralho.qtd] = carta;
        baralho.qtd++;
    }
    
    public static void imprimirBaralho (Baralho baralho) {
        int i;
        for (i=0; i<52; i++) {
            if (baralho.cartas[i].numero > 1 && baralho.cartas[i].numero < 11) System.out.printf ("-> %d de %s\n", baralho.cartas[i].numero, baralho.cartas[i].naipe);
            else {
                switch (baralho.cartas[i].numero) {
                    case 1 -> System.out.printf ("-> As de %s\n", baralho.cartas[i].naipe);
                    case 11 -> System.out.printf ("-> Valete de %s\n", baralho.cartas[i].naipe);
                    case 12 -> System.out.printf ("-> Dama de %s\n", baralho.cartas[i].naipe);
                    case 13 -> System.out.printf ("-> Rei de %s\n", baralho.cartas[i].naipe);
                }
            }
        }
    }
}