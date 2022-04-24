//Ex 7

package com.mycompany.lista2;

public class Item {
    Produto produto = new Produto();
    int qtd;
    
    public static void novoItem (Item item, Produto produto, int qtd) {
        item.produto = produto;
        item.qtd = qtd;
    }
}
