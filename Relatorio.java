import java.util.*;
import java.time.LocalDate;
import java.math.BigDecimal;

public class Relatorio {
    
    // Atributos principais
    private LocalDate dataInicio;
    private LocalDate dataFim;
    private String responsavel;

    // Dados simulados
    private Map<String, BigDecimal> vendasPorProduto;
    private Map<String, Integer> quantidadeVendida;
    private Map<String, BigDecimal> despesasPorCategoria;

    // Construtor
    public Relatorio(LocalDate dataInicio, LocalDate dataFim, String responsavel) {
        this.dataInicio = dataInicio;
        this.dataFim = dataFim;
        this.responsavel = responsavel;
        inicializarDados();
    }

    // Inicialização dos dados simulados
    private void inicializarDados() {
        vendasPorProduto = new HashMap<>();
        vendasPorProduto.put("Bolo de Chocolate", new BigDecimal("850.00"));
        vendasPorProduto.put("Torta de Limão", new BigDecimal("540.00"));
        vendasPorProduto.put("Cupcake", new BigDecimal("320.00"));
        vendasPorProduto.put("Brigadeiro", new BigDecimal("250.00"));

        quantidadeVendida = new HashMap<>();
        quantidadeVendida.put("Bolo de Chocolate", 34);
        quantidadeVendida.put("Torta de Limão", 27);
        quantidadeVendida.put("Cupcake", 40);
        quantidadeVendida.put("Brigadeiro", 75);

        despesasPorCategoria = new HashMap<>();
        despesasPorCategoria.put("Ingredientes", new BigDecimal("420.00"));
        despesasPorCategoria.put("Energia elétrica", new BigDecimal("180.00"));
        despesasPorCategoria.put("Embalagens", new BigDecimal("150.00"));
        despesasPorCategoria.put("Outros", new BigDecimal("100.00"));
    }

    // Métodos principais

    
     //Gera um relatório de vendas simulando os produtos e valores vendidos.
     
    public void gerarRelatorioVendas() {
        System.out.println("   RELATÓRIO DE VENDAS   ");
        System.out.println("Período: " + dataInicio + " até " + dataFim);
        System.out.println("Responsável: " + responsavel + "\n");

        BigDecimal total = BigDecimal.ZERO;
        for (Map.Entry<String, BigDecimal> venda : vendasPorProduto.entrySet()) {
            System.out.printf("%-20s R$ %.2f%n", venda.getKey(), venda.getValue());
            total = total.add(venda.getValue());
        }

        System.out.println("\nTotal de Vendas: R$ " + total);
        System.out.println("===============================\n");
    }

    /**
     * Exibe a lista de produtos mais vendidos, em ordem decrescente.
     */
    public void gerarRelatorioProdutosMaisVendidos() {
        System.out.println("   PRODUTOS MAIS VENDIDOS   ");

        quantidadeVendida.entrySet().stream()
            .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
            .forEach(entry -> 
                System.out.printf("%-20s %d unidades%n", entry.getKey(), entry.getValue())
            );

        System.out.println("==================================\n");
    }

    
      //Exibe um resumo das despesas divididas por categoria.
     
    public void gerarRelatorioDespesas() {
        System.out.println("   DESPESAS POR CATEGORIA   ");
        despesasPorCategoria.forEach((cat, val) ->
                System.out.printf("%-20s R$ %.2f%n", cat, val));
        System.out.println("==================================\n");
    }

    
     //Calcula o lucro total do período (receita - despesas).
     
    public void gerarRelatorioFinanceiro() {
        BigDecimal receitaTotal = vendasPorProduto.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal despesaTotal = despesasPorCategoria.values().stream()
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        BigDecimal lucro = receitaTotal.subtract(despesaTotal);

        System.out.println("   RELATÓRIO FINANCEIRO   ");
        System.out.println("Receita total: R$ " + receitaTotal);
        System.out.println("Despesas totais: R$ " + despesaTotal);
        System.out.println("Lucro líquido: R$ " + lucro);
        System.out.println("================================\n");
    }

    // Getters e Setters
    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public LocalDate getDataFim() { return dataFim; }
    public void setDataFim(LocalDate dataFim) { this.dataFim = dataFim; }

    public String getResponsavel() { return responsavel; }
    public void setResponsavel(String responsavel) { this.responsavel = responsavel; }
}

