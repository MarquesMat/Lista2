//Ex 5

package com.mycompany.lista2;

public class Televisao {
    boolean ligada = false, silencioso = false;
    int volume = 5, canal = 20;
    
    public static void ligar (Televisao tv, int l) {
        tv.ligada = l != 0;
    }
    
    public static void silenciar (Televisao tv, int s) {
        tv.silencioso = s != 0;
    }
    
    public static void alterarVolume (Televisao tv, int v) {
        if (tv.volume < 10 && v == 1) tv.volume++;
        else if (tv.volume > 0 && v == 0) tv.volume--;
    }
    
    public static void mudarCanal (Televisao tv, int c) {
        if (c >= 0 && c <= 99) tv.canal = c;
        else System.out.println("CANAL INVALIDO");
    }
    
    public static void canalAnterior (Televisao tv) {
        if (tv.canal > 0) tv.canal--;
        else System.out.println("CANAL INVALIDO");
    }
    
    public static void canalProximo (Televisao tv) {
        if (tv.canal < 99) tv.canal++;
        else System.out.println("CANAL INVALIDO");
    }
    
    public static void estado (Televisao tv) {
        if (tv.ligada) System.out.println ("A TV ESTA LIGADA");
        else System.out.println ("A TV ESTA DESLIGADA");
        System.out.println ("CANAL: "+tv.canal);
        System.out.println ("VOLUME: "+tv.volume);
        if (tv.silencioso) System.out.println ("A TV ESTA SILENCIADA");
        else System.out.println ("A TV NAO ESTA SILENCIADA");
    }
}
