package padroes.projeto.java.singleton.facade;

/**
 * 
 * @author Adeilson Valente
 */
public class Pagamento {
    public void processarPagamento(double valor) {
        System.out.println("Pagamento de R$" + valor + " processado com sucesso.");
    }
}