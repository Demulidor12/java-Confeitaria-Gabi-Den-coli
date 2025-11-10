public class PagamentoPix extends Pagamento {
    private String chavePix;

    public PagamentoPix(double valor, String chavePix) {
        super(valor, "Pix");
        this.chavePix = chavePix;
    }

    @Override
    public void realizarPagamento() {
        System.out.println(" Processando pagamento via Pix...");
        System.out.println("Chave Pix: " + chavePix);
        System.out.println("Valor: R$" + valor);
        System.out.println("Pagamento Pix concluído com sucesso");
        gerarComprovante();
    }
}
