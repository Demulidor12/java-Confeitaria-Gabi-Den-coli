import java.util.ArrayList;
import java.util.List;

public class FichaTecnica {
    private List <Ingrediente> ingredientes;

    public FichaTecnica(){
        ingredientes = new ArrayList<>();
    }

    public void adicionarIngrediente(Ingrediente ingrediente){
        ingredientes.add(ingrediente);
    }

    public void removerIngrediente(String nomeIngrediente){
        ingredientes.removeIf(i-> i.getNome().equalsIgnoreCase(nomeIngrediente));
    }

    public void exibirFichaBase(){
        System.out.println("=== Ficha Técnica ===");
        for(Ingrediente ingrediente: ingredientes){
            System.out.println(ingrediente);
        }
    }

    public void exibirFichaPersonalizada(String produto, int quantidadeProdutos){
        if(quantidadeProdutos <=0){
            System.out.println("A quantidade informada é inválida");
        }
            System.out.println("--- Ficha para produzir " + quantidadeProdutos + " formas padrão de" + produto + "---");
            for(Ingrediente ingrediente: ingredientes){
                double total = ingrediente.getQuantidadeIngredientePorProduto() * quantidadeProdutos;
                System.out.println(ingrediente.getNome() + ": " + total);
        }
            
    }
} 
