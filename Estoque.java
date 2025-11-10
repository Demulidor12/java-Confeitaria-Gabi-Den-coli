import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private List<Produto> produtos;

    public Estoque() {
        this.produtos = new ArrayList<>();
    }

    public void adicionarProduto(String codigoProduto, String nomeProduto, int quantidade, 
                                double precoUnitario, String dataEntrada, String fornecedor) {
        
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto().equals(codigoProduto)) {
                System.out.println("Erro: Produto com código " + codigoProduto + " já existe no estoque.");
                return;
            }
        }
        
        Produto novoProduto = new Produto(codigoProduto, nomeProduto, quantidade, 
                                         precoUnitario, dataEntrada, fornecedor);
        produtos.add(novoProduto);
        System.out.println("Produto adicionado com sucesso: " + nomeProduto);
    }

    public void descontarEstoque(String codigoProduto) {
        descontarEstoque(codigoProduto, 1);
    }

    public void descontarEstoque(String codigoProduto, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto().equals(codigoProduto)) {
                if (produto.getQuantidade() >= quantidade) {
                    produto.setQuantidade(produto.getQuantidade() - quantidade);
                    System.out.println("Estoque descontado. Nova quantidade: " + produto.getQuantidade());
                } else {
                    System.out.println("Erro: Quantidade insuficiente em estoque.");
                }
                return;
            }
        }
        System.out.println("Erro: Produto não encontrado.");
    }

    public String consultarProduto(String codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto().equals(codigoProduto)) {
                return produto.toString();
            }
        }
        return "Produto não encontrado.";
    }

    public String listarProdutos() {
        if (produtos.isEmpty()) {
            return "Estoque vazio.";
        }
        
        StringBuilder lista = new StringBuilder();
        lista.append("=== LISTA DE PRODUTOS NO ESTOQUE ===\n");
        for (Produto produto : produtos) {
            lista.append(produto.toString()).append("\n");
        }
        lista.append("Total de produtos: ").append(produtos.size());
        return lista.toString();
    }

    public List<Produto> getProdutos() {
        return new ArrayList<>(produtos);
    }

    public boolean produtoExiste(String codigoProduto) {
        for (Produto produto : produtos) {
            if (produto.getCodigoProduto().equals(codigoProduto)) {
                return true;
            }
        }
        return false;
    }
}