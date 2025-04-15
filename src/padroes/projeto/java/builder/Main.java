package padroes.projeto.java.builder;

/**
 * 
 * @author Adeilson Valente
 */
public class Main {

    public static void main(String[] args) {
        // Criação de produtos
        Produto produto1 = new Produto("Notebook", 4500.00);
        Produto produto2 = new Produto("Mouse", 150.00);

        // Construção do pedido usando o Builder
        Pedido pedido = new Pedido.Builder()
                .setCliente("João Silva")
                .adicionarProduto(produto1)
                .adicionarProduto(produto2)
                .setObservacoes("Entregar apos as 18h.")
                .build();

        // Exibindo o pedido
        System.out.println(pedido);
    }
}
