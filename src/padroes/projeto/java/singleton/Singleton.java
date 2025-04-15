/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package padroes.projeto.java.singleton;

/**
 *
 * @author Adeilson Valente
 */
public class Singleton {

    private static Singleton instancia = new Singleton();

    private Singleton() {
        super();
    }

    public static Singleton getInstancia() {
        return instancia;
    }
}
