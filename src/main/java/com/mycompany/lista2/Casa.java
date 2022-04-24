//Ex 4

package com.mycompany.lista2;

import java.util.Scanner;

public class Casa {
    String cor;
    
    public static void pintarCasa (Casa casa, String cor) {
        casa.cor = cor;
    }
    
    public static void localPortas (PortasCasa porta, int i) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf ("\nDigite o local da porta %d: ", i);
        porta.local = teclado.next();
    }
    
    public static void estadoPortas (PortasCasa porta, String loc) {
        Scanner teclado = new Scanner(System.in);
        System.out.printf ("\nSelecione ABRIR(1) ou FECHAR(0) a porta de %s: ", loc);
        porta.estado = teclado.nextInt();
    }
    
    public static void quantasPortasEstaoAbertas (int p1, int p2, int p3) {
        System.out.printf("\n\nHa %d portas abertas na casa.", (p1+p2+p3));
    }
}
