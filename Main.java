public class Main {
    public static void main(String[] args) {
        Estoque estoque = new Estoque();

        estoque.adicionarProduto("P001", "Bolo de Chocolate", 10, 45.00, "2024-01-15", "Fornada do Dia");
        estoque.adicionarProduto("P002", "Brigadeiro", 50, 2.50, "2024-01-15", "Produção Própria");
        estoque.adicionarProduto("P003", "Coxinha", 30, 4.50, "2024-01-15", "Produção Própria");

        estoque.adicionarProduto("P001", "Bolo de Morango", 5, 52.00, "2024-01-16", "Fornada do Dia");

        System.out.println(estoque.consultarProduto("P001"));
        System.out.println(estoque.consultarProduto("P999"));

        System.out.println(estoque.listarProdutos());

        estoque.descontarEstoque("P001");
        estoque.descontarEstoque("P002", 10);
        estoque.descontarEstoque("P999", 1);

        System.out.println(estoque.listarProdutos());
    }
}