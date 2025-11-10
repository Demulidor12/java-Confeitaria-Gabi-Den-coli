public class Pessoa {
    private String usuario;
    private String senha;
    private String nome;
    private int telefone;
    private String endereco;

    public Pessoa(String usuario, String senha, String nome, int telefone, String endereco) {
        this.usuario = usuario;
        this.senha = senha;
        this.nome = nome;
        
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getTelefone() {
        return telefone;
    }

    public void setTelefone(int telefone) {
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void realizarLogin(String nome, String senha) {
        if (this.nome.equals(nome) && this.senha.equals(senha)) {
            System.out.println("Login realizado com sucesso");
        } else {
            System.out.println("Usuário ou senha incorretos");
        }
    }
}

