import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o valor do pagamento: R$");
        double valor = sc.nextDouble();
        sc.nextLine(); 

        System.out.println("Escolha a forma de pagamento:");
        System.out.println("1 - Pix");
        System.out.println("2 - Cartao");
        System.out.print("Opcao: ");
        int opcao = sc.nextInt();
        sc.nextLine(); 

        Pagamento pagamento = null;

        if (opcao == 1) {
            System.out.print("Digite a chave Pix: ");
            String chave = sc.nextLine();
            pagamento = new PagamentoPix(valor, chave);
        } else if (opcao == 2) {
            System.out.print("Digite o numero do cartao: ");
            String cartao = sc.nextLine();
            pagamento = new PagamentoCartao(valor, cartao);
        } else {
            System.out.println("Opcao invalida");
            System.exit(0);
        }

        pagamento.realizarPagamento();

        sc.close();
    }
}
