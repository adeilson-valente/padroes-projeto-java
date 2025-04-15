package padroes.projeto.java.strategy;

/**
 *
 * @author Adeilson Valente
 */
public class ISS implements Imposto {

    @Override
    public double calcular(double valor) {
        return valor * 0.06; // ISS de 6%
    }
}
