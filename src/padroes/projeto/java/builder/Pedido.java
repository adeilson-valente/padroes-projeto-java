package padroes.projeto.java.builder;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Adeilson Valente
 */
public class Pedido {

    private String cliente;
    private List<Produto> produtos;
    private String observacoes;

    private Pedido(String cliente, List<Produto> produtos, String observacoes) {
        this.cliente = cliente;
        this.produtos = produtos;
        this.observacoes = observacoes;
    }

    public String getCliente() {
        return cliente;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public String getObservacoes() {
        return observacoes;
    }

    @Override
    public String toString() {
        return "Pedido{"
                + "cliente='" + cliente + '\''
                + ", produtos=" + produtos
                + ", observacoes='" + observacoes + '\''
                + '}';
    }

    // Builder interno da classe Pedido
    public static class Builder {

        private String cliente;
        private List<Produto> produtos = new ArrayList<>();
        private String observacoes;

        public Builder setCliente(String cliente) {
            this.cliente = cliente;
            return this;
        }

        public Builder adicionarProduto(Produto produto) {
            this.produtos.add(produto);
            return this;
        }

        public Builder setObservacoes(String observacoes) {
            this.observacoes = observacoes;
            return this;
        }

        public Pedido build() {
            return new Pedido(cliente, produtos, observacoes);
        }
    }
}
