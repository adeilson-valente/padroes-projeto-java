package padroes.projeto.java.singleton.facade;

/**
 *
 * @author Adeilson Valente
 */
public class Main {

    public static void main(String[] args) {
        // Criar o Facade
        PedidoFacade pedidoFacade = new PedidoFacade();

        // Realizar um pedido
        pedidoFacade.realizarPedido("Notebook", 4500.00);
    }
}
