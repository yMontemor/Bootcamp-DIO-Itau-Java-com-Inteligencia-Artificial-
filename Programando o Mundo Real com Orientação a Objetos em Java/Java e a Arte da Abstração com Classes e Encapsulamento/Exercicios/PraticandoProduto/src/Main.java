public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00,10);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());
        produto.setPreco(3200.00);
        System.out.println(produto.getPreco());
        produto.adicionarEstoque(9);
        produto.removerEstoque(2);
        Produto produto2 = new Produto("Videogame", 5500.00,0);
        produto2.adicionarEstoque(10);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getPreco());
        System.out.println(produto2.getQuantidade());
        produto2.aplicarDesconto(10);
        System.out.println(produto2.getPreco());
    }
}
