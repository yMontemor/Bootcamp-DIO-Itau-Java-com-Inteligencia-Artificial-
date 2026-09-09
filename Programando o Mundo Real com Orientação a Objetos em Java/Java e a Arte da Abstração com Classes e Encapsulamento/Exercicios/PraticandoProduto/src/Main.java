public class Main {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook", 3500.00,10);
        System.out.println(produto.getNome());
        System.out.println(produto.getPreco());
        System.out.println(produto.getQuantidade());
        produto.setPreco(3200.00);
        System.out.println(produto.getPreco());
    }
}
