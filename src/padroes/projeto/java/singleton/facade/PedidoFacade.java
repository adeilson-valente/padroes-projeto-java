package padroes.projeto.java.singleton.facade;

/**
 *
 * @author Adeilson Valente
 */
public class PedidoFacade {

    private Pagamento pagamento;
    private Estoque estoque;
    private Notificacao notificacao;

    public PedidoFacade() {
        this.pagamento = new Pagamento();
        this.estoque = new Estoque();
        this.notificacao = new Notificacao();
    }

    public void realizarPedido(String produto, double valor) {
        System.out.println("Iniciando o processamento do pedido...");

        // Interações com os subsistemas
        estoque.reservarProduto(produto);
        pagamento.processarPagamento(valor);
        notificacao.enviarNotificacao("Seu pedido de \"" + produto + "\" foi processado com sucesso!");

        System.out.println("Pedido concluido.");
    }
}
