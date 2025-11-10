public class Ingrediente {
   private String nome;
   private double quantidadeIngredientePorProduto;
   private String unidadeMedida;
   
    public Ingrediente(String nome, double quantidadeIngredientePorProduto, String unidadeMedida){
        this.nome = nome;
        this.quantidadeIngredientePorProduto = quantidadeIngredientePorProduto;
        this.unidadeMedida = unidadeMedida;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getQuantidadeIngredientePorProduto(){
        return this.quantidadeIngredientePorProduto;
    }

    public void setQuantidadeIngredienterPorProduto(double quantidadeIngredientePorProduto){
        this.quantidadeIngredientePorProduto = quantidadeIngredientePorProduto;
    }

    public String getUnidadeMedida(){
        return this.unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida){
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString(){
        return 
        this.nome + "\n" + 
        "Quantidade: " + this.quantidadeIngredientePorProduto + "\n" +
        "Unidade de medida(g ou kg): " +this.unidadeMedida + "\n" +
        "===================================";
    }
}
