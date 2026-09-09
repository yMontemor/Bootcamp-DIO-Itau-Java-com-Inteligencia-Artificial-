public class Produto {
    private String nome; // atributo do objeto que será criado
    private double preco; // atributo do objeto que será criado
    private int quantidade; // atributo do objeto que será criado

    public Produto(String nome, double preco, int quantidade) { // parâmetros
            setNome(nome);
            setPreco(preco);
            setQuantidade(quantidade);
    }

    public String getNome() { // metodo usado para obter/consultar valor encapsulado
        return nome;
    }

    public double getPreco(){
        return preco;
    }

    public int getQuantidade(){
        return quantidade;
    }

    public void setNome(String nome){
        if (nome != null && !nome.isBlank()) {
            this.nome = nome;
        }
    }

    public void setPreco(double preco){
        if (preco > 0){
            this.preco = preco;
        }
    }

    public void setQuantidade(int quantidade){
        if (quantidade >= 0){
            this.quantidade = quantidade;
        }
    }

    public void adicionarEstoque(int quantidade){
        if (quantidade > 0){
            this.quantidade = this.quantidade + quantidade;
        }
    }

    public void removerEstoque(int quantidade){
        if (quantidade > 0 && quantidade <= this.quantidade){
            this.quantidade = this.quantidade - quantidade;
        }
    }

    public void aplicarDesconto(double percentual){
        if (percentual > 0 && percentual <= 100) {
            this.preco = this.preco - (percentual * this.preco / 100) ;
        }
    }
}