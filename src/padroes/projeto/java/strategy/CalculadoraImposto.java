package padroes.projeto.java.strategy;

/**
 *
 * @author Adeilson Valente
 */
public class CalculadoraImposto {

    private Imposto estrategia;

    // Construtor para definir a estratégia inicial
    public CalculadoraImposto(Imposto estrategia) {
        this.estrategia = estrategia;
    }

    // Método para alterar a estratégia
    public void setEstrategia(Imposto estrategia) {
        this.estrategia = estrategia;
    }

    // Método para calcular o imposto
    public double calcularImposto(double valor) {
        if (estrategia == null) {
            throw new IllegalStateException("Nenhuma estrat�gia definida!");
        }
        return estrategia.calcular(valor);
    }
}
