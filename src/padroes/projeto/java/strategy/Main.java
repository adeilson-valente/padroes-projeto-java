package padroes.projeto.java.strategy;

/**
 *
 * @author Adeilson Valente
 */
public class Main {

    public static void main(String[] args) {
        // Criação de estratégias
        Imposto iss = new ISS();
        Imposto icms = new ICMS();

        // Usando o contexto com a estratégia ISS
        CalculadoraImposto calculadora = new CalculadoraImposto(iss);
        double valorISS = calculadora.calcularImposto(1000.0);
        System.out.println("Imposto ISS: " + valorISS);

        // Mudando para a estratégia ICMS
        calculadora.setEstrategia(icms);
        double valorICMS = calculadora.calcularImposto(1000.0);
        System.out.println("Imposto ICMS: " + valorICMS);
    }
}
