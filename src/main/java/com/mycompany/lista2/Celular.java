//Ex 8

package com.mycompany.lista2;

public class Celular {
    Bateria bateria = new Bateria();
    
    public static void novoCelular (Celular celular, int a, int c) {
        celular.bateria.atualCarga = a;
        celular.bateria.capacidadeCarga = c;
    }
    
    public static void imprimirCelular (Celular celular) {
        double nivel = (celular.bateria.atualCarga*100.0/celular.bateria.capacidadeCarga);
        System.out.printf ("NIVEL DE BATERIA: %.0f%%", nivel);
    }
    
    public static void consumirBateria (Celular celular, int n) {
        celular.bateria.atualCarga -= n;
    }
}
