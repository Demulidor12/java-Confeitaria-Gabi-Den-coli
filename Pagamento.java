import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public abstract class Pagamento {
    protected double valor;
    protected String formaPagamento;
    protected LocalDateTime dataPagamento;

    public Pagamento(double valor, String formaPagamento) {
        this.valor = valor;
        this.formaPagamento = formaPagamento;
        this.dataPagamento = LocalDateTime.now();
    }

    public abstract void realizarPagamento();

   
    public void gerarComprovante() {
        DateTimeFormatter formatoData = DateTimeFormatter.ofPattern("10/11/2025 12:32:59");
        System.out.println("COMPROVANTE DE PAGAMENTO");
        System.out.println("Forma de pagamento: " + formaPagamento);
        System.out.println("Valor pago: R$" + valor);
        System.out.println("Data: " + dataPagamento.format(formatoData));
        System.out.println("Status: Pago com sucesso ");
        System.out.println("====================================");
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public double getValor() {
        return valor;
    }
}
