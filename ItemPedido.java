
package com.mycompany.confeitaria;
public class ItemPedido {
    //A classe produto já existe
    private Produto produto;
    private int quantidade;
    private double subtotal;
    
    public ItemPedido(Produto produto, int quantidade){
        if (quantidade <=0){
            throw new  IllegalArgumentException(" A quantidade deve ser maior que zero");
        }
    }
    
    public double calcularSubtotal(){
        this.subtotal = this.produto.getPreco() * this.quantidade;
        return this.subtotal;
    }
    
}

