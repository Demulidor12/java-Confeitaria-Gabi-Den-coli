import java.time.LocalDate;

public class TesteRelatorio {
    public static void main(String[] args) {
        Relatorio r = new Relatorio(
            LocalDate.of(2025, 10, 1),
            LocalDate.of(2025, 10, 31),
            "Lucas Lima Ferreira"
        );

        r.gerarRelatorioVendas();
        r.gerarRelatorioProdutosMaisVendidos();
        r.gerarRelatorioDespesas();
        r.gerarRelatorioFinanceiro();
    }
}


