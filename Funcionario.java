/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testepedidos.mavenproject1;

/**
 *
 * @author demulidor12
 */
public class Funcionario extends Pessoa {

    private String cargo;

    public Funcionario(String cargo, String usuario, String senha, String nome, int telefone, String endereco) {
        super(usuario, senha, nome, telefone, endereco);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void realizarCadastro(String nome, int telefone, String endereco, String cargo) {
        System.out.println("Cadastro realizado: " + nome + "\nCargo: " + cargo);
    }

    public void alterarInformacoesCadastro() {
        System.out.println("Informações de cadastro alteradas.");
    }

    public void editarCatalogo() {
        System.out.println("Catálogo editado.");
    }

    public void editarFichaTecnica() {
        System.out.println("Ficha técnica alterada.");
    }
}
