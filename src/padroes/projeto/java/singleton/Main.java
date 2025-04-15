package padroes.projeto.java.singleton;

/**
 *
 * @author Adeilson Valente
 */
public class Main {

    public static void main(String[] args) {
        // Obtenha a instância única
        Singleton s1 = Singleton.getInstancia();
        Singleton s2 = Singleton.getInstancia();

        // Verifique se ambas as instancias são iguais
        System.out.println("São a mesma instância? " + (s1 == s2)); // Deve imprimir true
    }
}
