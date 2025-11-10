/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepedidos.mavenproject1;

/**
 *
 * @author demulidor12
 */
public class Cliente extends Pessoa {

    private double tempoEntrega;    

    public Cliente(String usuario, String senha, String nome, int telefone, String endereco, double tempoEntrega) {
        super(usuario, senha, nome, telefone, endereco);
        this.tempoEntrega = tempoEntrega;
    }

    public double getTempoEntrega() {
        return tempoEntrega;
    }

    public void setTempoEntrega(double tempoEntrega) {
        this.tempoEntrega = tempoEntrega;
    }
    
    public void visualizarCatalogo() {
        System.out.println("Exibindo catálogo de produtos...");
    }

    public void fazerPedido() {
        System.out.println("Pedido realizado com sucesso.");
    }

    public void realizarPagamento(String formaPagamento) {
        System.out.println("Pagamento realizado via " + formaPagamento);
    }
}