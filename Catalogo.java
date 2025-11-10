/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepedidos.mavenproject1;

/**
 *
 * @author demulidor12
 */
public class Catalogo {
    
    private String nome;
    private double valor;
    private String descricao;
    private String regra;
    private String ingredientes;

    public Catalogo(String nome, double valor, String descricao, String regra, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.regra = regra;
        this.ingredientes = ingredientes;
    }

    public String editarCatalogo(String nome, double valor, String descricao, String regra, String ingredientes) {
        this.nome = nome;
        this.valor = valor;
        this.descricao = descricao;
        this.regra = regra;
        this.ingredientes = ingredientes;

        return "Catálogo atualizado com sucesso!";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getRegra() {
        return regra;
    }

    public void setRegra(String regra) {
        this.regra = regra;
    }

    public String getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(String ingredientes) {
        this.ingredientes = ingredientes;
    }
    
    public void exibirCatalogo() {
        System.out.println("=== Catálogo ===");
        System.out.println("Nome: " + this.nome);
        System.out.println("Valor: R$ " + this.valor);
        System.out.println("Descrição: " + this.descricao);
        System.out.println("Regras: " + this.regra);
        System.out.println("Ingredientes: " + this.ingredientes);
        System.out.println("=================");
    }
    
}
