package com.mycompany.lista2;

public class Ex8 {
    public static void historico (int texto, int chamadas) {
        System.out.printf ("\n\nForam enviadas %d mensagens de texo\n", texto);
        System.out.printf ("O total de chamadas durou %d segundos\n\n", chamadas);
    }
    
    public static void main (String[] args) {
        int texto, chamadas;
        Celular celular = new Celular();
        Celular.novoCelular(celular, 3000, 3000); //objeto, carga atual, carga total
        System.out.println ("ESTADO INICIAL DO CELULAR: ");
        Celular.imprimirCelular(celular);
        texto = 10;
        chamadas = 400;
        historico (texto, chamadas);
        Celular.consumirBateria(celular, texto);
        Celular.consumirBateria(celular, (chamadas/5));
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        Celular.imprimirCelular(celular);
        texto = 100;
        chamadas = 600;
        historico (texto, chamadas);
        Celular.consumirBateria(celular, texto);
        Celular.consumirBateria(celular, (chamadas/5));
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        Celular.imprimirCelular(celular);
        texto = 300;
        chamadas = 5000;
        historico (texto, chamadas);
        Celular.consumirBateria(celular, texto);
        Celular.consumirBateria(celular, (chamadas/5));
        System.out.println ("ESTADO ATUAL DO CELULAR: ");
        Celular.imprimirCelular(celular);
    }
}
