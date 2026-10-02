public sealed class Usuario permits Gerente, Vendedor, Atendente {

    private String nome;
    private String email;
    private String senha;
    private boolean administrador;

    public Usuario(String nome, String email, String senha, boolean administrador) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.administrador = administrador;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isAdministrador() {
        return administrador;
    }

    public void realizarLogin(){
        System.out.println("O usuário " + getNome() + " entrou no sistema usando o seguinte e-mail: " + getEmail());
    }

    public void realizarLogoff(){
        System.out.println(getNome() + " foi deslogado");
    }

    public void alterarDados(String novoNome, String novoEmail){
        setNome(novoNome);
        setEmail(novoEmail);
    }

    public void alterarSenha(String novaSenha){
        setSenha(novaSenha);
    }
}
