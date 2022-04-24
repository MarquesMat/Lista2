package com.mycompany.lista2;

public class Ex7 {
    public static void main (String[] args) {
        //Criando produtos:
        Produto refri = new Produto();
        Produto.novoProduto(refri, "Coca-cola", 5.50, 80);
        Produto carne = new Produto();
        Produto.novoProduto(carne, "Alcatra", 49.90, 21);
        Produto alcool = new Produto();
        Produto.novoProduto(alcool, "Vinho", 25.90, 32);
        
        //Criando itens:
        Item item1 = new Item();
        Item.novoItem(item1, refri, 3);
        Item item2 = new Item();
        Item.novoItem(item2, carne, 1);
        Item item3 = new Item();
        Item.novoItem(item3, alcool, 2);
        
        //Criando pedido:
        Pedido pedido = new Pedido();
        Pedido.novoPedido(pedido, item1);
        Pedido.novoPedido(pedido, item2);
        Pedido.novoPedido(pedido, item3);
        Pedido.pagamento(pedido, "Cartao");
        
        //Imprimindo pedido:
        Pedido.recibo(pedido);
    }
}
