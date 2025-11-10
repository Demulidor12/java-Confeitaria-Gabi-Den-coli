public class Produto {
    private int quantidade;
    private String codigoProduto;
    private String nomeProduto;
    private double precoUnitario;
    private String dataEntrada;
    private String fornecedor;

    public Produto(String codigoProduto, String nomeProduto, int quantidade, 
                   double precoUnitario, String dataEntrada, String fornecedor) {
        this.codigoProduto = codigoProduto;
        this.nomeProduto = nomeProduto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
        this.dataEntrada = dataEntrada;
        this.fornecedor = fornecedor;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public String getCodigoProduto() {
        return codigoProduto;
    }

    public void setCodigoProduto(String codigoProduto) {
        this.codigoProduto = codigoProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    public String getDataEntrada() {
        return dataEntrada;
    }

    public void setDataEntrada(String dataEntrada) {
        this.dataEntrada = dataEntrada;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    @Override
    public String toString() {
        return String.format("Código: %s | Nome: %s | Quantidade: %d | Preço: R$ %.2f | Data: %s | Fornecedor: %s",
                codigoProduto, nomeProduto, quantidade, precoUnitario, dataEntrada, fornecedor);
    }
}