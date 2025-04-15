package padroes.projeto.java.strategy;

/**
 *
 * @author Adeilson Valente
 */
public class ICMS implements Imposto {

    @Override
    public double calcular(double valor) {
        return valor * 0.18; // ICMS de 18%
    }
}
