public class TesteFichaTecnica {
    public static void main(String[] args) {

        FichaTecnica ficha = new FichaTecnica();

        ficha.adicionarIngrediente(new Ingrediente("Farinha", 200.0, "g"));
        ficha.adicionarIngrediente(new Ingrediente("Ovos", 3, "un"));
        ficha.adicionarIngrediente(new Ingrediente("Leite", 350.0, "ml"));
        ficha.adicionarIngrediente(new Ingrediente("Óleo", 200, "un. médias"));
        ficha.adicionarIngrediente(new Ingrediente("Cenoura", 3, "ml"));

        ficha.exibirFichaBase();

        ficha.exibirFichaPersonalizada(" Bolo de cenoura ", 2);

        ficha.removerIngrediente("Leite");
        System.out.println("\nApós remover 'Leite':");
        ficha.exibirFichaBase();

    }
}