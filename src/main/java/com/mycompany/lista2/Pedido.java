//Ex 7

package com.mycompany.lista2;

public class Pedido {
    Item[] itens = new Item[5];
    String pagamento;
    int qtd_itens = 0;
    double total = 0.0;
    
    public static void novoPedido (Pedido pedido, Item item) {
        pedido.itens[pedido.qtd_itens] = item;
        pedido.qtd_itens++;
    }
    
    public static void pagamento (Pedido pedido, String pag) {
        pedido.pagamento = pag;
    }
    
    public static void recibo (Pedido pedido) {
        int i;
        System.out.println ("RESUMO DO PEDIDO: ");
        for (i=0; i<pedido.qtd_itens; i++) {
            System.out.printf ("Item %d: %s\n%d x %.2f\n", (i+1),pedido.itens[i].produto.nome, pedido.itens[i].qtd, pedido.itens[i].produto.preco);
            pedido.total += (pedido.itens[i].qtd * pedido.itens[i].produto.preco);
        }
        System.out.printf ("VALOR TOTAL: %.2f\n", pedido.total);
        System.out.printf ("FORMA DE PAGAMENTO: %s", pedido.pagamento);
    }
}
