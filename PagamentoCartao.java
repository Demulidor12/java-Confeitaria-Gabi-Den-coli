public class PagamentoCartao extends Pagamento {
    private String numeroCartao;

    public PagamentoCartao(double valor, String numeroCartao) {
        super(valor, "Cartao de Credito");
        this.numeroCartao = numeroCartao;
    }

    @Override
    public void realizarPagamento() {
        System.out.println("Processando pagamento via Cartao...");
        System.out.println("Numero do cartao: " + numeroCartao);
        System.out.println("Valor: R$" + valor);
        System.out.println("Pagamento no cartao aprovado");
        gerarComprovante();
    }
}
